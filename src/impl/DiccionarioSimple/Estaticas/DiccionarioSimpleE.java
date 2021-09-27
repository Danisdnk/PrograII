package impl.DiccionarioSimple.Estaticas;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;
import impl.Conjuntos.Dinamicas.ConjuntoLD;

public class DiccionarioSimpleE implements DiccionarioSimpleTDA {
    class Elemento { // Las entradas del diccionario
        int clave;
        int valor;
    }

    Elemento[] elementos;
    int cant;

    public void InicializarDiccionario() {
        elementos = new Elemento[100];
        cant = 0;
    }

    public void Agregar(int clave, int valor) {
        int Pos = Clave2Ind(clave);
        if ( Pos == -1 ) { // La clave no existe
            Pos = cant; // Nueva entrada
            elementos[Pos] = new Elemento();
            elementos[Pos].clave = clave;
            cant++;
        }
        elementos[Pos].valor = valor;
    }

    private int Clave2Ind(int clave) {
        int i = cant - 1;
        while (i >= 0 && elementos[i].clave != clave)
            i--;
        return i;
    }

    public void Eliminar(int clave) {
        int Pos = Clave2Ind(clave);
        if ( Pos != -1 ) { // La clave existe
            elementos[Pos] = elementos[cant - 1];
            cant--;
        }
    }

    public int Recuperar(int clave) {
        int Pos = Clave2Ind(clave);
        return elementos[Pos].valor;
    }

    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new ConjuntoLD();
        c.InicializarConjunto();
        for (int i = 0; i < cant; i++)
            c.Agregar(elementos[i].clave);
        return c;
    }
}
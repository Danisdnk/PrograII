package impl.Conjuntos.Dinamicas;

import api.ConjuntoTDA;

public class ConjuntoLD implements ConjuntoTDA {
    class Nodo { // la celula de la estructura
        int info; // el valor almacenado
        Nodo sig; // la referencia al siguiente nodo
    }

    Nodo c; // la referencia de la estructura

    public void InicializarConjunto() {
        c = null;
    }


    public void Agregar(int x) {
        if ( !this.Pertenece(x) ) { // Se verifica pertenencia
            Nodo nuevo = new Nodo(); // el nuevo nodo que se agregar´a
            nuevo.info = x;
            nuevo.sig = c;
            c = nuevo;

        }
    }


    public int Elegir() {
        return c.info; // elegimos el primero (puede ser cualquiera)
    }


    public boolean ConjuntoVacio() {
        return ( c == null );
    }


    public void Sacar(int x) {
        if ( c != null ) {
            if ( c.info == x ) { // es el primero
                c = c.sig;
            } else { // es algun otro; lo buscamos ´
                Nodo aux = c;
                while (aux.sig != null && aux.sig.info != x)
                    aux = aux.sig;
                if ( aux.sig != null ) { // encontrado
                    aux.sig = aux.sig.sig;
                }
            }
        }

    }

    public boolean Pertenece(int x) {
        Nodo aux = c;
        while (aux != null && aux.info != x)
            aux = aux.sig;
        return ( aux != null );

    }
}
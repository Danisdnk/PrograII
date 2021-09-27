package impl.Colas.Dinamicas;

import api.ColaTDA;

public class ColaDTF1 implements ColaTDA {

    class Nodo { // la c´elula de la estructura
        int info; // el valor almacenado
        Nodo sig; // la referencia al siguiente nodo
    }

    Nodo primero; // primer elemento (mas antiguo)
    Nodo ultimo; // ultimo elemento (mas reciente)

    public void InicializarCola() {
        primero = null;
        ultimo = null;
    }

    public void Acolar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = null;
        if ( ultimo != null ) // cola no vac´ıa
            ultimo.sig = nuevo;
        ultimo = nuevo;
        if ( primero == null ) // la cola estaba vac´ıa
            primero = ultimo;
    }

    public void Desacolar() {
        primero = primero.sig; // nueva referencia a la estructura
        if ( primero == null ) // la cola qued´o vac´ıa
            ultimo = null;
    }

    public boolean ColaVacia() {
        return ( ultimo == null );
    }

    public int Primero() {
        return primero.info;
    }
}


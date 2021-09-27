package impl.Pilas.Dinamicas;

import api.PilaTDA;

public class PilaDinamica implements PilaTDA {

    class Nodo { // la c´elula de la estructura
        int info; // el valor almacenado
        Nodo sig; // la referencia al siguiente nodo
    }

    Nodo primero; // la referencia a la estructura

    public void InicializarPila() {
        primero = null;
    }

    public void Apilar(int x) { // el nuevo elemento se agrega al inicio
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = primero;
        primero = nuevo; // nueva referencia a la estructura
    }

    public void Desapilar() {
        primero = primero.sig; // nueva referencia a la estructura
    }

    public boolean PilaVacia() {
        return ( primero == null );

    }

    public int Tope() {
        return ( primero.info );

    }
}

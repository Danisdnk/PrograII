package api;

public interface PilaTDA {
    void InicializarPila(); // sin precondiciones
    void Apilar(int x); // pila inicializada
    void Desapilar(); // pila inicializada y no vac´ıa
    boolean PilaVacia(); // pila inicializada
    int Tope(); // pila inicializada y no vacıa
}
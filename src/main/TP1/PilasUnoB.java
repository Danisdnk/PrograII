package main.TP1;

import impl.Pilas.Estaticas.PilaTF1;
//A partir del TDA Pila definido, escribir distintos métodos que permitan

public class PilasUnoB {

    //b)Copiar una Pila en otra(dejándola en el mismo orden que la original)
    public static PilaTF1 cargarPila() {
        PilaTF1 nuevaPila = new PilaTF1();
        nuevaPila.InicializarPila();
        nuevaPila.Apilar(5);
        nuevaPila.Apilar(2);
        nuevaPila.Apilar(39);
        return nuevaPila;
    }

    public static void mostrarPila(PilaTF1 pila) {
        PilaTF1 copia = new PilaTF1();
        copia.InicializarPila();

        while (!pila.PilaVacia()) {
            copia.Apilar(pila.Tope());
            pila.Desapilar();
        }

        System.out.println("tope");

        while (!copia.PilaVacia()){
            System.out.print(copia.Tope() + " ");
            copia.Desapilar();
        }

    }
    public static void main(String[] args) {
        var miPila= cargarPila();
        mostrarPila(miPila);
    }

}
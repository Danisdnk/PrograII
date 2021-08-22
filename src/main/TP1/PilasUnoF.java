package main.TP1;

import impl.Pilas.Estaticas.PilaTF1;
//A partir del TDA Pila definido, escribir distintos métodos que permitan

public class PilasUnoF {

    // f)Calcular el promedio de los elementos de una Pila

    public static PilaTF1 cargarPila() {
        PilaTF1 nuevaPila = new PilaTF1();
        nuevaPila.InicializarPila();
        nuevaPila.Apilar(5);
        nuevaPila.Apilar(2);
        nuevaPila.Apilar(12);
        return nuevaPila;
    }

    public static void mostrarPila(PilaTF1 pila) {
        double sumar = 0;
        int contar = 0;
        System.out.print("calcular promedio elementos pila: ");

        while (!pila.PilaVacia()) {
            sumar += pila.Tope();
            contar++;
            pila.Desapilar();
        }

        System.out.print(sumar/contar);
    }

    public static void main(String[] args) {
        var miPila = cargarPila();
        mostrarPila(miPila);
    }

}
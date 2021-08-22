package main.TP1;

import impl.Pilas.Estaticas.PilaTF1;
//A partir del TDA Pila definido, escribir distintos métodos que permitan

public class PilaUnoA {

    //a) Pasar una Pila a otra (dejándola en orden inverso)
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

        System.out.println("tope");
        while (!pila.PilaVacia()) {
            copia.Apilar(pila.Tope());
            System.out.print(copia.Tope() + " ");
            pila.Desapilar();
            copia.Desapilar();
        }

    }
    public static void main(String[] args) {
        var miPila= cargarPila();
        mostrarPila(miPila);
    }

}
/** b)Copiar una Pila en otra(dejándola en el mismo orden que la original)
        c)Invertir el contenido de una Pila.
        d)Contar los elementos de una Pila
        e)Sumar los elementos de una Pila
        f)Calcular el promedio de los elementos de una Pila**/
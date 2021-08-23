package main.TP1;

import impl.Colas.Estaticas.ColaTF1;
import impl.Pilas.Estaticas.PilaTF1;

public class ColasCuatroB {
    //b) Invertir el contenido de una Cola (pueden usarse Pilas auxiliares)

    public static ColaTF1 cargarCola() {
        ColaTF1 cola = new ColaTF1();
        cola.InicializarCola();
        cola.Acolar(3);
        cola.Acolar(45);
        cola.Acolar(76);

        return cola;
    }

    public static ColaTF1 pasarCola(ColaTF1 cola) {

        PilaTF1 pila = new PilaTF1();
        pila.InicializarPila();

        while (!cola.ColaVacia()) {
            pila.Apilar(cola.Primero());
            cola.Desacolar();
        }
        while (!pila.PilaVacia()) {
            cola.Acolar(pila.Tope());
            pila.Desapilar();
        }

        return cola;
    }

    public static void mostrar(ColaTF1 cola) {

        System.out.println("tope");
        while (!cola.ColaVacia()) {
            System.out.println(cola.Primero());
            cola.Desacolar();

        }
    }

    public static void main(String[] args) {
      var cola=cargarCola();
      var nuevaCola= pasarCola(cola);
      mostrar(nuevaCola);
    }
}

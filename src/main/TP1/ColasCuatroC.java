package main.TP1;

import impl.Colas.Estaticas.ColaTF1;
import impl.Colas.Estaticas.ColaTF3;


public class ColasCuatroC {
    // c) Invertir el contenido de una Cola (NO pueden usarse Pilas auxiliares)

    public static ColaTF3 cargarCola() {
        ColaTF3 cola = new ColaTF3();
        cola.InicializarCola();
        cola.Acolar(3);
        cola.Acolar(45);
        cola.Acolar(76);
        cola.Acolar(90);

        return cola;
    }

    public static ColaTF1 pasarCola(ColaTF3 cola) {

        ColaTF1 copia = new ColaTF1();
        copia.InicializarCola();

        while (!cola.ColaVacia()) {
            copia.Acolar(cola.Primero());
            cola.Desacolar();

        }
        return copia;
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

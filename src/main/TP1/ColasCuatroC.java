package main.TP1;

import impl.Colas.Estaticas.ColaTF1;
import impl.Pilas.Estaticas.PilaTF1;

public class ColasCuatroC {
    /** c) Invertir el contenido de una Cola (NO pueden usarse Pilas auxiliares)
    d) Determinar si el final de la Cola C1 coincide o no con la Cola C2.
            e) Determinar si una Cola es capicúa o no. Para ser capicúa debe cumplir
    que el primer elemento es igual al último, el segundo igual al penúltimo, etc.
    f) Determinar si la Cola C1 es la inversa de la Cola C2. Dos Colas serán
    inversas, si tienen los mismos elementos pero en orden inverso.**/

    public static ColaTF1 cargarCola() {
        ColaTF1 cola = new ColaTF1();
        cola.InicializarCola();
        cola.Acolar(3);
        cola.Acolar(45);
        cola.Acolar(76);

        return cola;
    }

    public static ColaTF1 pasarCola(ColaTF1 cola) {

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

package main.TP1;

import impl.Colas.Estaticas.ColaTF1;

public class ColasCuatroA {

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


    public static void main(String[] args) {
      var cola=cargarCola();
      var nuevaCola= pasarCola(cola);
    }
}

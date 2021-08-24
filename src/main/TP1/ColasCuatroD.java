package main.TP1;

import impl.Colas.Estaticas.ColaTF1;

public class ColasCuatroD {
    // d) Determinar si el final de la Cola C1 coincide o no con la Cola C2.

    public static ColaTF1 cargarCola(int a, int b, int c) {
        ColaTF1 cola = new ColaTF1();
        cola.InicializarCola();
        cola.Acolar(a);
        cola.Acolar(b);
        cola.Acolar(c);

        return cola;
    }

    public static boolean compararCola(ColaTF1 cola, ColaTF1 colaDos) {
        int ultimoCola = 0;
        int ultimoColadDos = 0;

        while (!cola.ColaVacia()) {
            ultimoCola = cola.Primero();
            cola.Desacolar();
        }
        while (!colaDos.ColaVacia()) {
            ultimoColadDos = colaDos.Primero();
            colaDos.Desacolar();
        }

        return ultimoCola == ultimoColadDos;
    }

    public static void mostrar(boolean rta) {
        System.out.println("¿son iguales?");
        System.out.println(rta);
    }

    public static void main(String[] args) {
        var cola = cargarCola(3, 45, 75);
        var colaDos = cargarCola(4, 6, 76);
        var nuevaCola = compararCola(cola, colaDos);
        mostrar(nuevaCola);
    }
}

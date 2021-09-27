package main.TP1;

import impl.ColasPrioridad.Estaticas.ColaPrioridadDA1;

public class ColasPrioridadB {

    public static ColaPrioridadDA1 cargarCola(int a, int p1, int b, int p2, int c, int p3) {
        ColaPrioridadDA1 cola = new ColaPrioridadDA1();
        cola.InicializarCola();
        cola.AcolarPrioridad(a, p1);
        cola.AcolarPrioridad(b, p2);
        cola.AcolarPrioridad(c, p3);
        return cola;
    }

    public static boolean compararColas(ColaPrioridadDA1 cola, ColaPrioridadDA1 colaDos) {

        int sonIguales = 0;
        int i = 0;
        while (!cola.ColaVacia() && !colaDos.ColaVacia()) {
            i++;
            if ( cola.Prioridad() == colaDos.Prioridad() && cola.Primero() == colaDos.Primero() ) {
                sonIguales++;
            }

            cola.Desacolar();
            colaDos.Desacolar();
        }
        return sonIguales == i;
    }

    public static void main(String[] args) {
        var cola = cargarCola(2, 2, 5, 8, 8, 8);
        var colaDos = cargarCola(2, 2, 5, 8, 8, 8);
        var compararColas = compararColas(cola, colaDos);
        System.out.print("las dos colas son iguales: " + compararColas);
    }
}

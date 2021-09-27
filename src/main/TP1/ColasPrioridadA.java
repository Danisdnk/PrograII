package main.TP1;

import impl.ColasPrioridad.Estaticas.ColaPrioridadDA1;

public class ColasPrioridadA {

    public static ColaPrioridadDA1 cargarCola(int a, int p1, int b, int p2, int c, int p3) {
        ColaPrioridadDA1 cola = new ColaPrioridadDA1();
        cola.InicializarCola();
        cola.AcolarPrioridad(a, p1);
        cola.AcolarPrioridad(b, p2);
        cola.AcolarPrioridad(c, p3);
        return cola;
    }
    public static ColaPrioridadDA1 cargarColaDos(int a, int p1, int b, int p2, int c, int p3, int d, int p4) {
        ColaPrioridadDA1 cola = new ColaPrioridadDA1();
        cola.InicializarCola();
        cola.AcolarPrioridad(a, p1);
        cola.AcolarPrioridad(b, p2);
        cola.AcolarPrioridad(c, p3);
        cola.AcolarPrioridad(d, p4);
        return cola;
    }

    public static ColaPrioridadDA1 nuevaColaPrioridad(ColaPrioridadDA1 cola, ColaPrioridadDA1 colaDos) {

        ColaPrioridadDA1 nuevaColaPrioridad = new ColaPrioridadDA1();
        nuevaColaPrioridad.InicializarCola();
        while (!cola.ColaVacia() && !colaDos.ColaVacia()) {

            if ( cola.Prioridad() == colaDos.Prioridad() ) { //si son iguales
                nuevaColaPrioridad.AcolarPrioridad(cola.Primero(), cola.Prioridad()); //agrego C1
                nuevaColaPrioridad.AcolarPrioridad(colaDos.Primero(), colaDos.Prioridad()); //agrego C2
                cola.Desacolar();
                colaDos.Desacolar();
            } else if ( cola.Prioridad() > colaDos.Prioridad() ) {
                nuevaColaPrioridad.AcolarPrioridad(cola.Primero(), cola.Prioridad()); //Si s
                cola.Desacolar();
            } else {
                nuevaColaPrioridad.AcolarPrioridad(colaDos.Primero(), colaDos.Prioridad());
                colaDos.Desacolar();
            }
        }
        return nuevaColaPrioridad;
    }


    public static void mostrarNuevaCP(ColaPrioridadDA1 cola) {
        while (!cola.ColaVacia()) {
            System.out.print("prioridad " + cola.Prioridad());
            System.out.println("- valor " + cola.Primero() + "");
            cola.Desacolar();
        }
    }

    public static void main(String[] args) {
        var cola = cargarCola(4, 2, 5, 8, 8, 4);
        var colaDos = cargarColaDos(2, 2, 5, 3, 9, 10, 5, 23);
        var nuevaCola = nuevaColaPrioridad(cola, colaDos);
        mostrarNuevaCP(nuevaCola);
    }
}

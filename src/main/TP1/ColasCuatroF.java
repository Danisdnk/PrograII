package main.TP1;

import impl.Colas.Estaticas.ColaTF1;
import impl.Pilas.Estaticas.PilaTF1;


public class ColasCuatroF {
    // f) Determinar si la Cola C1 es la inversa de la Cola C2. Dos Colas serán

    public static ColaTF1 cargarCola(int a, int b, int c) {
        ColaTF1 cola = new ColaTF1();
        cola.InicializarCola();
        cola.Acolar(a);
        cola.Acolar(b);
        cola.Acolar(c);

        return cola;
    }

    public static boolean compararCola(ColaTF1 cola, ColaTF1 colaDos) {
        var capicua = 0;
        var i = 0;
        int totalRecorridos = 0;

        PilaTF1 pilaCopiaCola = new PilaTF1();
        pilaCopiaCola.InicializarPila();

        while (!colaDos.ColaVacia()) { //invierto una cola
            pilaCopiaCola.Apilar(colaDos.Primero());
            colaDos.Desacolar();
        }
        while (!pilaCopiaCola.PilaVacia() && !cola.ColaVacia()) { // mientras ambos tengan elementos
            totalRecorridos++; //+1 a elementos recorridos
            if ( pilaCopiaCola.Tope() == cola.Primero() ) { //si coincide ultimo con primero +1
                capicua++;
            }
            pilaCopiaCola.Desapilar();
            cola.Desacolar();
        }
        //si total capicua es como total elementos entonces
        return totalRecorridos == capicua;

    }


    public static void main(String[] args) {
        var cola = cargarCola(1, 2, 3);
        var colaDos = cargarCola(3, 2, 1);
        var nuevaCola = compararCola(cola, colaDos);
        System.out.println("son inversas? " + nuevaCola);
    }
}

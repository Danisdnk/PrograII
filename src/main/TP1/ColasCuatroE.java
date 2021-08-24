package main.TP1;

import impl.Colas.Estaticas.ColaTF1;
import impl.Pilas.Estaticas.PilaTF1;


public class ColasCuatroE {
    // e) Determinar si una Cola es capicúa o no. Para ser capicúa debe cumpli que el primer elemento es igual al
    // último, el segundo igual al penúltimo, etc.

    public static ColaTF1 cargarCola(int a, int b, int c) {
        ColaTF1 cola = new ColaTF1();
        cola.InicializarCola();
        cola.Acolar(a);
        cola.Acolar(b);
        cola.Acolar(c);

        return cola;
    }

    public static boolean compararCola(ColaTF1 cola) {
        var capicua = 0;
        int totalRecorridos = 0;
        ColaTF1 cola1 = new ColaTF1();
        PilaTF1 CInvertida = new PilaTF1();
        cola1.InicializarCola();
        CInvertida.InicializarPila();

        while (!cola.ColaVacia()) { //invierto una cola
            CInvertida.Apilar(cola.Primero());
            cola1.Acolar(cola.Primero());
            cola.Desacolar();
        }

        while (!CInvertida.PilaVacia() && !cola1.ColaVacia()) { // mientras ambos tengan elementos
            totalRecorridos++; //+1 a elementos recorridos
            if ( CInvertida.Tope() == cola1.Primero() ) { //si coincide ultimo con primero +1
                capicua++;
            }
            CInvertida.Desapilar();
            cola1.Desacolar();
        }
        //si total capicua es como total elementos entonces
        return totalRecorridos == capicua && totalRecorridos > 0;
    }


    public static void main(String[] args) {
        var cola = cargarCola(1, 4, 6);
        var nuevaCola = compararCola(cola);
        System.out.println("son capicua? " + nuevaCola);
    }
}

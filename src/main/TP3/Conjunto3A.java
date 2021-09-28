package main.TP3;

import impl.Conjuntos.Estaticas.ConjuntoE;
import impl.Pilas.Estaticas.PilaTF1;

public class Conjunto3A {

    //calcular la diferencia simétrica entre dos conjuntos A y B (definido en clase)


    public static ConjuntoE cargarConjunto(int a, int b, int c) {
        ConjuntoE conjunto = new ConjuntoE();
        conjunto.InicializarConjunto();
        conjunto.Agregar(a);
        conjunto.Agregar(b);
        conjunto.Agregar(c);
        return conjunto;

    }

    public static ConjuntoE calcularDiferenciaSimetrica(ConjuntoE c1, ConjuntoE c2) {
        ConjuntoE c3 = new ConjuntoE();
        c3.InicializarConjunto();
        int num = 0;
        int num2 = 0;

        while (!c2.ConjuntoVacio()) {

            if ( !c1.ConjuntoVacio() ) { //si el conjunto no es vacio
                num = c1.Elegir();  //elegir un numero para buscar en c2
            } else { //si c1 es vacio entonces los valores que quedan en c2 son unicos
                num2 = c2.Elegir();
                c3.Agregar(num2);//agrego los valores a la cola
                c2.Sacar(num2);
            }

            if ( !c2.Pertenece(num) ) { //si num no esta en c2
                c3.Agregar(num);
                c1.Sacar(num);
            } else { //si esta en c1 y c2 los quito de ambas y no lo agrego a c3
                c1.Sacar(num);
                c2.Sacar(num);
            }
        }
        return c3;
    }

    public static void mostrarConjunto(ConjuntoE c) {

        while (!c.ConjuntoVacio()) {
            var num = c.Elegir();
            System.out.print(num + " ");
            c.Sacar(num);
        }

    }

    public static void main(String[] args) {

        var c1 = cargarConjunto(1, 2, 4);
        var c2 = cargarConjunto(1, 2, 9);
        var diferenciaSimetrica = calcularDiferenciaSimetrica(c1, c2);
        mostrarConjunto(diferenciaSimetrica);
    }


}

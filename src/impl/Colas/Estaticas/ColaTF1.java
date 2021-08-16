package impl.Colas.Estaticas;

import api.ColaTDA;

public class ColaTF1 implements ColaTDA {
    int[] arr; // arreglo que contiene la informaci´on
    int inx; // cantidad de elementos en la cola

    public void InicializarCola() {
        arr = new int[100];
        inx = 0;
    }

    public void Acolar(int x) {
        for (int i = inx - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = x;
        inx++;
    }

    public void Desacolar() {
        inx--;
    }

    public boolean ColaVacia() {
        return ( inx == 0 );
    }

    public int Primero() {
        return arr[inx - 1];
    }
}
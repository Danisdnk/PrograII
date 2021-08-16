package impl.Colas.Estaticas;

import api.ColaTDA;

public class ColaTF2 implements ColaTDA {
    int[] arr; // arreglo que contiene la informaci´on
    int inx; // cantidad de elementos en la cola

    public void InicializarCola() {
        arr = new int[100];
        inx = 0;
    }
    public void Acolar(int x) {
        arr[inx] = x;
        inx++;
    }
    public void Desacolar() {
        for (int i = 0; i < inx - 1; i++) {
            arr[i] = arr[i + 1];
        }
        inx--;
    }
    public boolean ColaVacia() {
        return ( inx == 0 );
    }
    public int Primero() {
        return arr[0];
    }
}
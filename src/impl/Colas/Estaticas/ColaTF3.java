package impl.Colas.Estaticas;

import api.ColaTDA;

public class ColaTF3 implements ColaTDA {
    int[] arr; // arreglo con toda la informaci´on

    public void InicializarCola() {
        arr = new int[100];
        arr[0] = 0;
    }

    public void Acolar(int x) {
        for (int i = arr[0]; i > 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[1] = x;
        arr[0]++;
    }

    public void Desacolar() {
        arr[0]--;
    }

    public boolean ColaVacia() {
        return ( arr[0] == 0 );
    }

    public int Primero() {
        return arr[arr[0]];
    }
}

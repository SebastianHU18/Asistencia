package Recursividad.Qui2;

import java.util.Arrays;

public class Punto13 {
    public static void problem13(int[] arreglo){
        int izq=0;
        int der= arreglo.length-1;
        while (izq<der){
            while (izq<der&&arreglo[izq]%2==0){izq++;}
            while (izq<der&&arreglo[der]%2!=0){der--;}
            if (izq<der){
                intercambiar(arreglo,izq,der);
            }
        }
    }

    public static void ordenar(int[] arreglo){
        problem13(arreglo); // separa

        int k = 0;
        while (k < arreglo.length && arreglo[k] % 2 == 0){
            k++;
        }

        Arrays.sort(arreglo, 0, k); // pares
        Arrays.sort(arreglo, k, arreglo.length); // impares
    }

    public static void intercambiar(int[] arreglo, int i, int j){
        int temp = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temp;
    }

    static void main() {
        int[] a = {3,2,7,4,1};
        System.out.println("Antes: " + Arrays.toString(a));
        ordenar(a);
        System.out.println("Después: " + Arrays.toString(a));
    }
}

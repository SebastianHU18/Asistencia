package Recursividad.Qui2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Punto10 {
    public static int frecuencia(int[] arreglo){
        Map<Integer,Integer> frec = new HashMap<>();
        for(int valor: arreglo){
            frec.put(valor, frec.getOrDefault(valor, 0)+1); // anadimos el primero y sigue contando respecto a este
        }
        return 0;
    }

    private static void mergeSortFrecuencia(int[] arreglo, int inicio, int fin, Map<Integer, Integer> frec){
        int medio=inicio+(fin-inicio)/2;
        mergeSortFrecuencia(arreglo, inicio, fin, frec);
        mergeSortFrecuencia(arreglo, medio+1, fin, frec);
        mergeFrecuencia(arreglo, inicio, medio, fin, frec);
    }

    private static void mergeFrecuencia(int[] arreglo, int inicio, int medio, int fin, Map<Integer, Integer> frec){
        int[] temp=new int[fin-inicio+1];
        int i=inicio;
        int j=medio+1;
        int k=0;
        while (i<=medio&&j<=fin){
        }
    }


}

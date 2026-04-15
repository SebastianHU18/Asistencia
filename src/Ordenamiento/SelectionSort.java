package Ordenamiento;

import java.util.Arrays;

public class SelectionSort {
    public static <T extends Comparable<T>> void SelectionSort(T[] arr){
    int totalIter=0;
        for (int i=0; i< arr.length; i++){
            int indiceMinimo=i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j].compareTo(arr[indiceMinimo]) < 0){
                    indiceMinimo = j;
                }
                totalIter++;
            }
            if (indiceMinimo!=i){
                T aux = arr[i];
                arr[i] = arr[indiceMinimo];
                arr[indiceMinimo] = aux;
            }
        }
        System.out.println("Total iteracciones" + totalIter);
    }

    static void main() {
        Persona[] personas = new Persona[4];
        Persona p1=new Persona("Valeria P",
                19,"No gracias");
        Persona p2=new Persona("Sebastian Z",
                37,"Si por favor :(");
        Persona p3=new Persona("Alejo U",18,
                "Si por favor");
        Persona p4=new Persona("Pablo E",20
                ,"Bueno");
        personas[0]=p1;
        personas[1]=p2;
        personas[2]=p3;
        personas[3]=p4;
        SelectionSort(personas);
        System.out.println(Arrays.toString(personas));
    }
}

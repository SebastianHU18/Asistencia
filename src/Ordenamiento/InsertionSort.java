package Ordenamiento;

import java.util.Arrays;

public class InsertionSort {
    public static<T extends Comparable<T>> void  InsertionSort(T[] arr){
        for (int i=1; i< arr.length; i++){
            T llave = arr[i];
            int j=i-1;
            while (j>=0 && llave.compareTo(arr[j]) < 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = llave;
        }
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
        InsertionSort(personas);
        System.out.println(Arrays.toString(personas));
    }
}

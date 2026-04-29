package Recursividad.Qui2;

public class Punto20 {
        public static void main(String[] args) {
            int[] arr = {15, 18, 2, 3, 6, 12};
            System.out.println(buscarRotado(arr, 3, 0, arr.length - 1)); // 3
        }

        // Clave: en un arreglo rotado, al menos UNA mitad siempre está ordenada
        // Determinamos cuál mitad está ordenada y decidimos en cuál buscar
        static int buscarRotado(int[] arr, int x, int izq, int der) {
            if (izq > der) return -1;

            int mid = izq + (der - izq) / 2;
            if (arr[mid] == x) return mid;

            // ¿La mitad IZQUIERDA está ordenada?
            if (arr[izq] <= arr[mid]) {
                // x está dentro del rango ordenado de la izquierda?
                if (x >= arr[izq] && x < arr[mid]) {
                    return buscarRotado(arr, x, izq, mid - 1);
                } else {
                    return buscarRotado(arr, x, mid + 1, der);
                }
            } else {
                // La mitad DERECHA está ordenada
                if (x > arr[mid] && x <= arr[der]) {
                    return buscarRotado(arr, x, mid + 1, der);
                } else {
                    return buscarRotado(arr, x, izq, mid - 1); // si no esta entre esos valores
                                                                    // vamos a ir a buscar a la otra mitad
                }
            }
        }
}

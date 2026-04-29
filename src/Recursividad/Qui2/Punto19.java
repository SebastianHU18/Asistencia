package Recursividad.Qui2;

public class Punto19 {
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 4, 2};
            System.out.println(elementoPico(arr, 0, arr.length - 1)); // 5
        }

        // Un pico es mayor que sus dos vecinos
        // Usamos búsqueda binaria: si arr[mid] < arr[mid+1], el pico está a la derecha
        static int elementoPico(int[] arr, int izq, int der) {
            if (izq == der) return arr[izq]; // CASO BASE: un solo elemento

            int mid = izq + (der - izq) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // La pendiente sube hacia la derecha → el pico está a la derecha
                return elementoPico(arr, mid + 1, der);
            } else {
                // La pendiente baja o es plana → el pico está en mid o a la izquierda
                return elementoPico(arr, izq, mid);
            }
        }
}

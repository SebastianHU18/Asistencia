package Recursividad.Qui2;

public class Punto5 {
        public static void main(String[] args) {
            int[] arr = {3, 7, 2, 9, 1};
            System.out.println(maximo(arr, 0)); // 9
        }

        // Retorna el mayor elemento desde arr[idx] hasta el final
        static int maximo(int[] arr, int idx) {
            // CASO BASE: solo queda un elemento → ese es el máximo
            if (idx == arr.length - 1) return arr[idx];

            // CASO RECURSIVO: compara el actual con el máximo del resto
            int maxResto = maximo(arr, idx + 1);
            return arr[idx] > maxResto ? arr[idx] : maxResto;
        }
}

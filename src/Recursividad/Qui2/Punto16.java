package Recursividad.Qui2;

public class Punto16 {
        public static void main(String[] args) {
            int[] arr = {1, 4, 5, 6};
            System.out.println(primerMayorIgual(arr, 6, 0, arr.length - 1)); // 5
        }

        // Retorna el valor del primer elemento >= x, o -1 si no existe
        static int primerMayorIgual(int[] arr, int x, int izq, int der) {
            if (izq > der) return -1;

            int mid = izq + (der - izq) / 2;

            if (arr[mid] <= x) {
                // mid puede ser la respuesta, pero buscamos si hay algo más a la izquierda
                int candidatoIzq = primerMayorIgual(arr, x, mid+1, der);
                return candidatoIzq == -1 ? arr[mid] : candidatoIzq; // en caso de que se haga la busqueda binaria
                // y ya quedemos en izq > der nos dice que este vendria siendo el reu
            } else {
                // arr[mid] < x → la respuesta está a la derecha
                return primerMayorIgual(arr, x, izq, mid-1);
            }
        }
}

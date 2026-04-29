package Recursividad.Qui2;

public class Punto6 {
        public static void main(String[] args) {
            int[][] matriz = {{1, 2, 3}, {2, 2, 4}};
            System.out.println(contarEnMatriz(matriz, 2, 0, 0)); // 3
        }

        // Recorre la matriz fila por fila, columna por columna recursivamente
        // f = fila actual, c = columna actual
        static int contarEnMatriz(int[][] m, int x, int f, int c) {

            // CASO BASE: salimos por debajo de la última fila → terminamos
            if (f == m.length) return 0;

            // Al llegar al final de una fila, pasamos a la siguiente
            if (c == m[f].length) return contarEnMatriz(m, x, f + 1, 0);

            // Contamos si el elemento actual es igual a x
            int esteVal = (m[f][c] == x) ? 1 : 0;

            // Avanzamos a la siguiente columna
            return esteVal + contarEnMatriz(m, x, f, c + 1);
        }
}

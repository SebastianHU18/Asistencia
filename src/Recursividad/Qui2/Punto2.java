package Recursividad.Qui2;

public class Punto2 {
        public static void main(String[] args) {
            System.out.println(contarCaminos(0, 0, 2, 2)); // 2
            System.out.println(contarCaminos(0, 0, 3, 3)); // 6
        }

        // f, c = posición actual | filas, cols = dimensiones totales
        static int contarCaminos(int f, int c, int filas, int cols) {
            // Caso base: llegamos al borde → solo hay 1 dirección posible
            if (f == filas - 1) return 1; // cuando llega a la ultima fila solo hay un camino posible
            if (c == cols - 1) return 1; // lo mismo cuando llega a la ultima columna
            // Caminos bajando + caminos yendo a la derecha
            return contarCaminos(f + 1, c, filas, cols)
                    + contarCaminos(f, c + 1, filas, cols);
        }
}

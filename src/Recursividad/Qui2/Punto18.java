package Recursividad.Qui2;

public class Punto18 {
        public static void main(String[] args) {
            System.out.println(raizCuadrada(16, 1, 16)); // 4
            System.out.println(raizCuadrada(9, 1, 9));   // 3
        }

        // Busca el entero r tal que r*r == n
        // Retorna r si existe, -1 si n no es cuadrado perfecto
        static int raizCuadrada(int n, int izq, int der) {
            if (izq > der) return -1;

            int mid = izq + (der - izq) / 2;
            long cuadrado = (long) mid * mid; // long evita overflow

            if (cuadrado == n) return mid;           // encontramos la raíz exacta
            if (cuadrado < n) return raizCuadrada(n, mid + 1, der); // raíz es mayor
            return raizCuadrada(n, izq, mid - 1);                   // raíz es menor
        }
}

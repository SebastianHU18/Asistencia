package Recursividad.Qui2;
import java.util.*;

public class Punto3 {
        public static void main(String[] args) {
            int[] arreglo = {1, 2};
            List<List<Integer>> resultado = new ArrayList<>();
            generarSubconjuntos(arreglo, 0, new ArrayList<>(), resultado);
            int i = 0;
            while (i < resultado.size()) {
                System.out.println(resultado.get(i));
                i++;
            }
        }

        // idx      = índice del elemento que decidimos incluir o no
        // actual   = subconjunto que llevamos construido
        // resultado = lista de todos los subconjuntos encontrados
        static void generarSubconjuntos(int[] arr, int idx,
                                        List<Integer> actual,
                                        List<List<Integer>> resultado) {
            // CASO BASE: procesamos todos los elementos → guardamos el subconjunto actual
            if (idx == arr.length) {
                resultado.add(new ArrayList<>(actual)); // copia, no referencia
                return;
            }

            // DECISIÓN 1: NO incluir arr[idx] → simplemente avanzamos
            generarSubconjuntos(arr, idx + 1, actual, resultado);

            // DECISIÓN 2: SÍ incluir arr[idx]
            actual.add(arr[idx]);                               // HACER
            generarSubconjuntos(arr, idx + 1, actual, resultado); // EXPLORAR
            actual.remove(actual.size() - 1);                  // DESHACER
        }
}

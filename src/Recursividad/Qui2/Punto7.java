package Recursividad.Qui2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Punto7 {
    static List<List<String>> resultados = new ArrayList<>();

    static void permutacionesCadena(String[] args, boolean[] usado, List<String> actual){
        if (actual.size() == args.length){
            resultados.add(new ArrayList<>(actual));
            return;
        }

        for (int i=0; i< args.length; i++){
            if (!usado[i]){
                actual.add(args[i]);
                usado[i] = true;
                permutacionesCadena(args, usado, actual);

                actual.remove(actual.size() -1);
                usado[i] = false;
            }
        }
    }

    static void main() {
        String[] args = {"a","b"};
        boolean[] usado = new boolean[args.length];
        List<String> actual = new ArrayList<>();

        permutacionesCadena(args, usado, actual);

        System.out.println("Total permutaciones: " + resultados.size());
        for (List<String> p : resultados) {
            System.out.println(p);
        }
    }
}

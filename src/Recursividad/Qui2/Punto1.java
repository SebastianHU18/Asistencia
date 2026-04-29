package Recursividad.Qui2;

public class Punto1 {
        public static void main(String[] args) {
            System.out.println(sumarNumeros("1abc34x5", 0, 0, false)); // 51
        }

        // cadena  = la cadena completa
        // idx     = posición actual que analizamos
        // numActual = el número que estamos construyendo dígito a dígito
        // leyendo = indica si el caracter anterior era dígito (estamos en medio de un número)
        static int sumarNumeros(String cadena, int idx, int numActual, boolean leyendo) {

            // CASO BASE: llegamos al final
            // Si estábamos leyendo un número, lo sumamos y retornamos
            if (idx == cadena.length()) {
                return leyendo ? numActual : 0;
            }

            char c = cadena.charAt(idx); // caracter actual

            if (c >= '0' && c <= '9') {
                // Es un dígito: construimos el número acumulando (ej: '1','2' → 12)
                int digito = c - '0';
                int nuevoNum = numActual * 10 + digito;
                // Seguimos sin sumar nada todavía (el número puede tener más dígitos)
                return sumarNumeros(cadena, idx + 1, nuevoNum, true);
            } else {
                int aporte = (numActual >= 10) ? numActual : 0;
                return aporte + sumarNumeros(cadena, idx + 1, 0, false);
            }
        }
    }

package Recursividad.Qui2;

public class Punto4 {
    static void main() {
        System.out.println(problem04("(((adas)))"));
    }
    public static boolean problem04(String text){
        return validarParentesis(text, 0, 0);
    }

    public static boolean validarParentesis(String text, int index, int cont){
        if (cont<0){
            return false;
        }
        if (index==text.length()){
            return cont==0;
        }
        char ch = text.charAt(index);
        if (ch=='('){
            return validarParentesis(text, index+1, cont+1);
        }
        if (ch==')'){
            return validarParentesis(text, index+1, cont-1);
        }
        return validarParentesis(text, index+1, cont);
    }
}

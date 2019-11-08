package creacionarbol;

import java.util.Arrays;

public class CreacionArbol {

    public static void main(String[] args) {
        String[] preOrden = {"A", "B", "D", "E", "C", "F", "G"};
        String[] inOrden = {"D", "B", "E", "A", "F", "C", "G"};
        String[][] arbol = new String[inOrden.length][preOrden.length];

        for (int i = 0; i < inOrden.length; i++) {
            for (int j = 0; j < preOrden.length; j++) {
                if (!preOrden[i].equals(inOrden[j])) {
                    arbol[i][j] = "   ";
                } else {
                    arbol[i][j] = "1";
                }

            }
        }
        
        for (int i = 0; i < inOrden.length; i++) {
            System.out.println(Arrays.deepToString(arbol[i]));
        }

    }

}

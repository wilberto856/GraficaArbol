package creacionarbol;

import java.util.ArrayList;
import java.util.Collections;

public class CreacionArbol {

    public static void main(String[] args) {
        String[] preOrden = {"A", "B", "D", "E", "C", "F", "G"};
        String[] inOrden = {"D", "B", "E", "A", "F", "C", "G"};
        String[][] arbol = new String[inOrden.length][preOrden.length];
        ArrayList<String> nodos = new ArrayList<>();

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
            for (int j = 0; j < preOrden.length; j++) {
                //System.out.println(Arrays.deepToString(arbol[i]));
                if (arbol[i][j].equals("1")) {
                    nodos.add(String.valueOf(j));
                }

            }
            
        }
        Collections.sort(nodos);
        System.out.println(nodos);
        for (String i : nodos) {
            System.out.print(inOrden[Integer.parseInt(i)]);
        }

    }

}

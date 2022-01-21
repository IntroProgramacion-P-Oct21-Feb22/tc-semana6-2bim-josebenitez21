/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;

/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int valor1 = 100;
        int valor2 = 110;
        String cadenaFinal;

        cadenaFinal = obtenerFuncion(valor1, valor2);
        System.out.println(cadenaFinal);
    }

    public static String obtenerFuncion(int a, int b) {
        String cadenaFinal = "";
        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = RandomUtils.nextInt(a, b);

        }
        for (int i = 0; i < c.length; i++) {
            cadenaFinal = String.format("%s %s", cadenaFinal, c[i]);

        }
        return cadenaFinal;
    }
}

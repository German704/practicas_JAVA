import java.util.*;
public class Main {
    public static void main(String[] args) {
        int inicialNumber = 5;
        int lastNumber = 14;

        int condition = inicialNumber % 2;

        /* ArrayList<Integer> anArrayNumber = new ArrayList<>();

        while (inicialNumber <= lastNumber) {
            anArrayNumber.add(inicialNumber++);
            //System.out.println("Array numeros : " + anArrayNumber);
        }
        System.out.println("Array numeros : " + anArrayNumber); */

        //---------------------------------------

       /* while (inicialNumber <= lastNumber) {
            inicialNumber++;
            if(condition == 0) {
                System.out.println("numeros pares : " + inicialNumber);
            }
        } */

        for (int i = 5; i <= lastNumber; i++) {
            if(i % 2 != 0) {
                inicialNumber = i;
                System.out.println("numeros impares : " + inicialNumber);
            }
        }


    }
}
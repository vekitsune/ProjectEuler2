/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccihataralatt;

/**
 *
 * @author Verosffy
 */
public class FibonacciHatarAlatt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hatar = 4000000;
        long sum = 0;
        long left = 1;
        long rigth = 2;
        long next;

        do {
            if (rigth % 2 == 0) {
                sum += rigth;
            }

            next = left + rigth;
            left = rigth;
            rigth = next;
        } while (rigth < hatar);
        System.out.println("a legnagyobb érték:" + left + "a párosak összege : " + sum);

    }

}

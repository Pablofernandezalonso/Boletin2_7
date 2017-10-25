
package boletin2_7;

import java.util.Scanner;


public class Boletin2_7 {

    
    public static void main(String[] args) {
        
        double c,f,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce temperatura en grados centígrados");
        c = sc.nextDouble();
        f = c * 1.8 + 32;
        k = c + 273.15;
        System.out.println(c+" grados Centígrados son " + f + " grados Farenheit");
        System.out.println(c+" grados Centígrados son " + k + " grados Kelvin");
        
        
        
        
    }
    
}

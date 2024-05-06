public class CalculationModule{
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}

import java.util.Scanner;

public class pmodular{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int number = scanner.nextInt();
        int fac=CalculationModule.factorial(number);
        System.out.println("El factorial del numero: "+ number + " es " + fac);
        
    }
}
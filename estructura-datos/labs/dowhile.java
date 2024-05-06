import java.util.Scanner;
public class dowhile{
public static void main (String[] args){
    int n; 
    Scanner leer = new Scanner (System.in);
    do {System.out.print("ingrese un Nro:");
    n = leer.nextInt();
    }while(n!=0);
    System.out.println("Bienvenido!!");
    }
}
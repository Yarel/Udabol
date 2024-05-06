import java.util.Scanner;
public class npositivo {
    public static void main  (String[] arg){
        int n;
        Scanner leer=new Scanner (System.in);
        do {
            System.out.print("Ingrese un numero positovo:");
            n=leer.nextInt();
        }while(n<0);
        System.out.println("El numero es positivo");
    }  
}

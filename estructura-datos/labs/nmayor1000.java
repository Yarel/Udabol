import java.util.Scanner;
public class nmayor1000 {
    public static void main  (String[] arg){
        int n,d=0;
        Scanner leer=new Scanner (System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000:");
            n=leer.nextInt();
    }while(n<1000);
        while(n>0){
            d=n%10;
            n=n/10;
            }
        System.out.println("Digito es: " + d );
       // System.out.println("Bien");
    }  
}

// import java.util.Scanner;
// public class nmayor1000 {
//     public static void main  (String[] arg){
//         int n,d=0;
//         Scanner leer=new Scanner (System.in);
//         do {
//             System.out.print("Ingrese un numero mayor a 1000:");
//             n=leer.nextInt();
//     }while(n<1000);
    
//         while(n>0){
//             d=n%10;
//             n=n/100;
//             }
//             System.out.println("Digito es: " + d );
       
//        // System.out.println("Bien");
//     }  
// }



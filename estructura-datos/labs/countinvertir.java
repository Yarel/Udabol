//realizar un programa para contar e invertir los digitos de un numero 

import java.util.Scanner;
public class Funcion1{

//funcion que devuelve el N de digitos
public int contar_dig(int n){
    int count=0;
    while(n>0)
    {n=n/10;
    count=count+1;
}
return count;
}

//funcion que inviert el N de digitos

public int invertir(int n){
    int dig=0, inv=0;
    while(n>0)
        {
            dig=n%10;
            inv=(inv*10)+dig;
            n=n/10;
        }
    return inv;
}

public static void main(String[] args) {
        int n;
        Scanner leer = new Scanner (System.in);
        Funcion1 F=new Funcion1();
        System.out.println("Ingrese un Nro:");
        n=leer.nextInt();
        int dig=F.contar_dig(n);
        System.out.println("El numero de digitos es: " + dig);
        System.out.println("El numero invertido es: "+ F.invertir(n));
    }
}
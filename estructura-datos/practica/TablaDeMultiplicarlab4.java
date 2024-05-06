import java.util.Scanner;

public class TablaDeMultiplicarlab4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor;
        
        System.out.print("Ingrese un valor del 1 al 10: ");
        valor = teclado.nextInt();
        
        if (valor < 1 || valor > 10) {
            System.out.println("El valor ingresado debe estar entre 1 y 10.");
            return;
        }
        
        System.out.println("Tabla de multiplicar del " + valor + ":");
        for (int i = 1; i <= 12; i++) {
            int resultado = valor * i;
            System.out.println(valor + " * " + i + " = " + resultado);
        }
    }
}

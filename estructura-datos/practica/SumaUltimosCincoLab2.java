import java.util.Scanner;

public class SumaUltimosCincoLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int sumaUltimosCinco = 0;
        for (int i = 5; i < 10; i++) {
            sumaUltimosCinco += numeros[i];
        }

        System.out.println("La suma de los últimos 5 números ingresados es: " + sumaUltimosCinco);
    }
}
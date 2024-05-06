import java.util.Scanner;

public class CalculadoraTriangulosLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de triángulos a procesar: ");
        int n = scanner.nextInt();

        int countTriangulosMayoresA12 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTriángulo #" + i);
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();

            double superficie = (base * altura) / 2;

            System.out.println("Base: " + base);
            System.out.println("Altura: " + altura);
            System.out.println("Superficie: " + superficie);

            if (superficie > 12) {
                countTriangulosMayoresA12++;
            }
        }

        System.out.println("\nCantidad de triángulos cuya superficie es mayor a 12: " + countTriangulosMayoresA12);
    }
}
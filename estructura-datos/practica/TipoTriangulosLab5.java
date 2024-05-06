import java.util.Scanner;

public class TipoTriangulosLab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de triángulos: ");
        int n = scanner.nextInt();

        int equilateros = 0;
        int isosceles = 0;
        int escalenos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTriángulo #" + i);
            System.out.print("Ingrese la longitud del primer lado: ");
            int lado1 = scanner.nextInt();
            System.out.print("Ingrese la longitud del segundo lado: ");
            int lado2 = scanner.nextInt();
            System.out.print("Ingrese la longitud del tercer lado: ");
            int lado3 = scanner.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Este es un triángulo equilátero.");
                equilateros++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Este es un triángulo isósceles.");
                isosceles++;
            } else {
                System.out.println("Este es un triángulo escaleno.");
                escalenos++;
            }
        }

        System.out.println("\nCantidad de triángulos equiláteros: " + equilateros);
        System.out.println("Cantidad de triángulos isósceles: " + isosceles);
        System.out.println("Cantidad de triángulos escalenos: " + escalenos);

        // Determinar el tipo de triángulo que posee menor cantidad
        String tipoMenorCantidad;
        int menorCantidad = Math.min(equilateros, Math.min(isosceles, escalenos));
        if (menorCantidad == equilateros) {
            tipoMenorCantidad = "equiláteros";
        } else if (menorCantidad == isosceles) {
            tipoMenorCantidad = "isósceles";
        } else {
            tipoMenorCantidad = "escalenos";
        }

        System.out.println("El tipo de triángulo que posee menor cantidad es: " + tipoMenorCantidad);
    }
}

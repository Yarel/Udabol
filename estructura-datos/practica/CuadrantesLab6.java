import java.util.Scanner;

public class CuadrantesLab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de puntos a procesar: ");
        int cantidadPuntos = scanner.nextInt();

        int primerCuadrante = 0;
        int segundoCuadrante = 0;
        int tercerCuadrante = 0;
        int cuartoCuadrante = 0;

        for (int i = 1; i <= cantidadPuntos; i++) {
            System.out.println("\nIngrese las coordenadas del punto #" + i + ":");
            System.out.print("Coordenada x: ");
            int x = scanner.nextInt();
            System.out.print("Coordenada y: ");
            int y = scanner.nextInt();

            if (x > 0 && y > 0) {
                primerCuadrante++;
            } else if (x < 0 && y > 0) {
                segundoCuadrante++;
            } else if (x < 0 && y < 0) {
                tercerCuadrante++;
            } else if (x > 0 && y < 0) {
                cuartoCuadrante++;
            }
        }

        System.out.println("\nCantidad de puntos en el primer cuadrante: " + primerCuadrante);
        System.out.println("Cantidad de puntos en el segundo cuadrante: " + segundoCuadrante);
        System.out.println("Cantidad de puntos en el tercer cuadrante: " + tercerCuadrante);
        System.out.println("Cantidad de puntos en el cuarto cuadrante: " + cuartoCuadrante);
    }
}

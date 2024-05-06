import java.util.Scanner;

public class PromedioEdadesLab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de estudiantes del turno mañana: ");
        int totalEstudiantesManana = scanner.nextInt();

        System.out.print("Ingrese el número total de estudiantes del turno tarde: ");
        int totalEstudiantesTarde = scanner.nextInt();

        System.out.print("Ingrese el número total de estudiantes del turno noche: ");
        int totalEstudiantesNoche = scanner.nextInt();

        int sumaEdadesManana = 0;
        int sumaEdadesTarde = 0;
        int sumaEdadesNoche = 0;

        System.out.println("\nIngrese las edades de los estudiantes del turno mañana:");
        for (int i = 1; i <= totalEstudiantesManana; i++) {
            System.out.print("Estudiante #" + i + ": ");
            int edad = scanner.nextInt();
            sumaEdadesManana += edad;
        }

        System.out.println("\nIngrese las edades de los estudiantes del turno tarde:");
        for (int i = 1; i <= totalEstudiantesTarde; i++) {
            System.out.print("Estudiante #" + i + ": ");
            int edad = scanner.nextInt();
            sumaEdadesTarde += edad;
        }

        System.out.println("\nIngrese las edades de los estudiantes del turno noche:");
        for (int i = 1; i <= totalEstudiantesNoche; i++) {
            System.out.print("Estudiante #" + i + ": ");
            int edad = scanner.nextInt();
            sumaEdadesNoche += edad;
        }

        double promedioManana = (double) sumaEdadesManana / totalEstudiantesManana;
        double promedioTarde = (double) sumaEdadesTarde / totalEstudiantesTarde;
        double promedioNoche = (double) sumaEdadesNoche / totalEstudiantesNoche;

        System.out.println("\nPromedio de edades del turno mañana: " + promedioManana);
        System.out.println("Promedio de edades del turno tarde: " + promedioTarde);
        System.out.println("Promedio de edades del turno noche: " + promedioNoche);

        String turnoMayorPromedio = "";
        double mayorPromedio = Math.max(promedioManana, Math.max(promedioTarde, promedioNoche));
        if (mayorPromedio == promedioManana) {
            turnoMayorPromedio = "mañana";
        } else if (mayorPromedio == promedioTarde) {
            turnoMayorPromedio = "tarde";
        } else {
            turnoMayorPromedio = "noche";
        }

        System.out.println("\nEl turno con el mayor promedio de edades es el turno " + turnoMayorPromedio);
    }
}

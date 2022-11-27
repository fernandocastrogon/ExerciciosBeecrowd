package category.begginer;
import java.util.Scanner;

//Little John wants to calculate and show the amount of spent fuel liters on a trip, using a car that does 12 Km/L.
// For this, he would like you to help him through a simple program. To perform the calculation,
// you have to read spent time (in hours) and the same average speed (km/h).
// In this way, you can get distance and then, calculate how many liters would be needed.
// Show the value with three decimal places after the point.


public class Beginner1017 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int duracaoViagemEmHoras = leitor.nextInt();
        int velocidadeMediaEmKM = leitor.nextInt();

        int distanciaPercorrida = duracaoViagemEmHoras * velocidadeMediaEmKM;

        double litrosNecessarios = distanciaPercorrida / 12.0;

        System.out.printf("%.3f\n",litrosNecessarios);

        leitor.close();








    }
}

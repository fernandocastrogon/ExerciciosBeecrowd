import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

//The input file contains two values: one integer value X representing the total distance (in Km)
// and the second one is a floating point number Y  representing the spent fuel total, with a digit after the decimal point.

public class Beginner1014 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int distanciaPercorrida = leitor.nextInt();
        double consumoCombustivel = leitor.nextDouble();

        double consumoPorLitro = distanciaPercorrida/consumoCombustivel;
        System.out.printf("%.3f km/l\n",consumoPorLitro);
        leitor.close();


    }
}

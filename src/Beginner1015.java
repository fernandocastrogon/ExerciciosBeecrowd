//Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2)
// and calculate the distance between them, showing four decimal places after the comma, according to the formula:


import java.util.Locale;
import java.util.Scanner;

public class Beginner1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);
        leitor.close();


    }


}

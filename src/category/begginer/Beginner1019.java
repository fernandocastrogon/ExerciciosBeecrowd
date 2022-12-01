package category.begginer;

import java.io.IOException;
import java.util.Scanner;



//Read an integer value, which is the duration in seconds of a certain event in a factory,
// and inform it expressed in hours:minutes:seconds.
//        Input
//        The input file contains an integer N.
//
//        Output
//        Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.

public class Beginner1019 {


    public static void main(String[] args) throws IOException {


        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        int horas = valor / 3600;
        int restoHoras = valor % 3600;

        int minutos = restoHoras / 60;
        int restoMinutos = restoHoras % 60;

        int segundos = restoMinutos;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);



    }


}

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


        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();

        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.printf("%d:%d:%d",hour,minutes,seconds);

        leitor.close();




    }


}

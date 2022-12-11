package category.begginer;

import java.io.IOException;
import java.util.Scanner;



///Read 4 integer values A, B, C and D. Then if B is greater than C and D
// is greater than A and if the sum of C and D is greater than the sum of A and B
// and if C and D were positives values and if A is even, write the message “Valores aceitos” (Accepted values).
// Otherwise, write the message “Valores nao aceitos” (Values not accepted).
//
//        Input
//        Four integer numbers A, B, C and D.
//
//        Output
//        Show the corresponding message after the validation of the values

public class Beginner1035 {


    public static void main(String[] args) throws IOException {


        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        if (B > C && D > A && (C+D)>(A+B) && C > 0 && D > 0 && (A % 2 == 0)){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }


        entrada.close();



    }


}

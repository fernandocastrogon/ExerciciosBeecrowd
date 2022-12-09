package category.begginer;

import java.io.IOException;
import java.util.Scanner;



//Read an integer value corresponding to a person's age (in days) and print it in years, months and days,
//        followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.
//        Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month.
//        In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364.
//        This is just an exercise for the purpose of testing simple mathematical reasoning.

public class Beginner1020 {


    public static void main(String[] args) throws IOException {


        Scanner entrada = new Scanner(System.in);
        int quantidadeTotalDias = entrada.nextInt();

        int ano = quantidadeTotalDias / 365;
        quantidadeTotalDias = quantidadeTotalDias % 365;
        int mes =  quantidadeTotalDias / 30;
        quantidadeTotalDias = quantidadeTotalDias % 30;
        int dia = quantidadeTotalDias;



        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);

        entrada.close();



    }


}

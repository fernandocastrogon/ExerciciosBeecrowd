package category.begginer;
import java.util.Scanner;

        Using the following table, write a program that reads a code and the amount of an item. After,
        print the value to pay. This is a very simple program with the only intention of practice of selection commands.

        Input
        The input file contains two integer numbers X and Y. X is the product code and Y is the quantity of this item
        according to the above table.

        Output
        The output must be a message "Total: R$ " followed by the total value to be paid,
        with 2 digits after the decimal point.



public class Beginner1038 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int produto = leitor.nextInt();
        double quantidade = leitor.nextDouble();
        switch (produto){
        case 1 -> System.out.printf("Total: R$ %.2f\n",quantidade*4.0);
        case 2 -> System.out.printf("Total: R$ %.2f\n",quantidade*4.50);
        case 3 -> System.out.printf("Total: R$ %.2f\n",quantidade*5.0);
        case 4 -> System.out.printf("Total: R$ %.2f\n",quantidade*2.0);
        case 5 -> System.out.printf("Total: R$ %.2f\n",quantidade*1.50);

        }
        leitor.close();

    }




}

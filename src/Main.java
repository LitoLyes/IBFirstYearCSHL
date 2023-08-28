import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");

        int N = keyboard.nextInt();
        int total = 1;

        for (int I = 1; I <= N; I++){
            total = total * I;
        }
        System.out.println(total);

        ///Homework 1
        ///Fundamental computer operations: add two number (a + b), determine which number is bigger (a < b || a > b)
        ///Compound computer operations: determine the factorial of a given number (see above), determine which name is
        ///the most common in a given list
        ///Features of a programming language: Fixed vocabulary, Unambiguous meaning, consistent grammar and syntax.
        ///Compiler: uses the code written in a certain programming language, and it transforms it into an executable
        ///machine instruction file.
        ///Constants are important because it can be used to name definite values that are well known or that prevails
        ///through the code

        ///Homework 2

        System.out.println("Introduce a number: ");
        int A = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        int B = keyboard.nextInt();

        if (A == B){

            System.out.println("The result is: " + (B * B + A) + " Because they are the same number.");
        }else{

            System.out.println("The result is: " + (A + B) + " Because they are not the same number.");
        }

        ///Homework 3

        int L1 = 10;

        for (int Final= 37; L1 < Final;){

            L1= L1 + 3;
            System.out.print(" " + L1);
        }

        System.out.println();

        int L2 = 998;

        for (int Final2 = 900; L2 > Final2;){

            L2 = L2 - 2;

            System.out.print(" " + L2);
        }

        System.out.println();

        int L3 = 1;
        int L4 =-1;
        int times = 0;

        while (times < 20){

            System.out.print(L3 + ", " + L4 + ", ");
            times++;
        }

        System.out.println();

        int L5 = 7;
        int L6 = 9;
        int times2 = 0;

        while (times2 < 60){

            System.out.print(L5 + "," + L5 + "," + L6 + ",");
            times2++;
        }

        System.out.println();

        ///Homework 4

        String[] actions = new String[3];
        actions[0]= "Hit";
        actions[1]= "Stay";
        actions[2]= "Bust";

        System.out.println("Enter the total of card numbers: ");
        int Total= keyboard.nextInt();
        System.out.println("You should: ");

        if (Total < 17){
            System.out.println(actions[0]);
        } else if ( Total >= 17 && Total <= 21) {
            System.out.println(actions[1]);
        }else {
            System.out.println(actions[2]);
        }

            ///Homework 5
            System.out.println("Enter a number for O:");
         int O = keyboard.nextInt();
            System.out.println("Enter a number for P: ");
         int P = keyboard.nextInt();

          if (O >= 100 && P <= 50 || O <= 50 && P >= 100 ) {
              System.out.println("1");
         }else {
              System.out.println("0");
          }

         ///Homework 6

        System.out.println();

        System.out.println("Give the weight:");
        int weight = keyboard.nextInt();
        int weight2 = weight;
        int price = 3;

        if (weight2 <= 2 ){

            System.out.println("The price is: " + price + "$");
        }
        else if (2 < weight2 && weight2 <= 5) {
            while (2 < weight2 && weight2 <= 5){

                weight2++;
                price = price + 2;

            }
            System.out.println("The price for the " + weight + " kg is " + price + "$" );
        }
        else if (weight2 > 5){

            while (weight2 > 5){
                weight2--;
                price = price + 3;
            }while (2 < weight2 && weight2 <= 5){

                weight2--;
                price = price + 2;

            }

            System.out.println("The price for the " + weight + " kg is " + price + "$" );

        }

        ///Homework 7

        System.out.println();

        int n = 1;

        while ((((n * n * n) + 91) % 47) != 0){
            n++;
        }
        System.out.println( "The smallest number for which ((((n * n * n) + 91) % 47) = 0) is : " + n);

        ///Homework 8

        System.out.println();

        int Times = 4;
        int result = 3;

        for (int i = 2; i <= Times; i++){

            result = result * 3;
        }
        System.out.println(result);

        System.out.println();

        int Times2 = 4;
        int result2 = 5;
        int result3 = result2;

        for (int i2 = 2; i2 <= Times2; i2++){

            result2 = result2 * result3;
        }
        System.out.println(result2);

        ///Homework 9

        System.out.println();

        int t = 0;
        int Hour1 = 0;
        int max = 0;
        int tmax = t;

        while (0 <= t && t <= 100){
            int Hour2 = t *((t-20) * (t - 100)) + 120000;
            t++;
            Hour1 = t *((t-20) * (t - 100)) + 60000;
            if (max < Hour2 - Hour1){
                max = Hour2 - Hour1;
                tmax = t;
            }

        }
        System.out.println(tmax + " " + max);



    }
}










import java.util.Scanner;

public class Lab007 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();


        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("leap year");

        } else {
            System.out.println("Not a leap year");
        }

        /*A year is a leap year if “any one of ” the following conditions are satisfied:

        1-) The year is multiple of 400.
        2)-The year is a multiple of 4 and not a multiple of 100.*/


    }
}








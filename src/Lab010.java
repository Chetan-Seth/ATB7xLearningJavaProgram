import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks Obtained by the student:");
        int score = sc.nextInt();
        char grade = 'F';
        if (score >= 0 && grade <= 100) {
            if (score >= 90 && score <= 100) {
                grade = 'O';
            } else if (score >= 80 && score < 90) {
                grade = 'A';
            } else if (score >= 70 && score < 80) {
                grade = 'B';
            } else if (score >= 60 && score < 70) {
                grade = 'C';
            } else if (score >= 50 && score < 60) {
                grade = 'D';
            } else if (score >= 0 && score < 50) {
                grade = 'F';
            }
        } else {
            System.out.println("Score entered is out of range");
        }
        if (score >= 0 && score <= 100) {

            System.out.println("the student got   " + grade);
        }
    }

}


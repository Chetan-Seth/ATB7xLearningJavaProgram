import java.util.Scanner;

public class Lab009 {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String= ");
        String str= sc.next();
        String nstr="";

        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            nstr= ch+ nstr;
        }

        if (nstr.equals(str))

            System.out.println("Yes,Palindrome String");

        else
            System.out.println("Not a Palindrome String");

        System.out.println(nstr);
    }

}



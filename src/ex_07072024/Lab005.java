package ex_07072024;

public class Lab005 {


    public static void main(String[] args) {

        String str1 = "Hello"; // in SCP
        String str2 = " Guys"; // in SCP
        String str3 = "Hello Guys"; // in SCP
        String str4 = str1.concat(str2);// in Heap
        String str5 = "Hello" +" Guys"; // in SCP
        String str6 = str1 + str2; // in Heap


        System.out.println(str3 == str4); // False
        System.out.println(str3 == str4.intern()); //True
        System.out.println(str5 == str6); // false
        System.out.println(str3 == str5); // true as both in scp
        System.out.println(str4 == str6); // false, both in heap but differnt objects
    }
}




package ex_07072024;

public class Lab005 {


    public static void main(String[] args) {

        String str1 = "Hello";

        String str2 = " Guys";

        String str3 = "Hello Guys";

        String str4 = str1.concat(str2);// Hello Guys

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        //str1 will refer to "Hello" in SCP
        //str2 will refer to "Guys" in SCP
        //str3 and str4 both will refer to "Hello Guys" in SCP so only 1 new object will get created.
        //key learning here is  that only 3 objects will be created in String constant pool.
    }

}



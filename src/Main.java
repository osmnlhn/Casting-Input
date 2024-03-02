import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cast int to String
        String intToString=Integer.toString(1);
        //Cast double to String
        String doubleToString=Double.toString(1.1);

        System.out.println();///Black Line

        //Print the values and Type of Values
        System.out.println(intToString + " "+ intToString.getClass());
        System.out.println(doubleToString + " "+ doubleToString.getClass());
        ///////////////////////////////////////////////////////////////
        //Cast String to int
        int stringToint=Integer.parseInt("1");
        //Cast String to Double
        double stringTodouble=Double.parseDouble("1.1");
        System.out.println();
        //Print the values and Type of Values
       System.out.println(stringToint + " " + ((Object)stringToint).getClass());
        System.out.println(stringTodouble + " " + ((Object)stringTodouble).getClass());

        /* User input */

        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a Number:");
        int myInt=scan.nextInt();
        System.out.println("Your number is:"+ myInt);

        for (int i=1; i<11 ; i++){
            System.out.println(i +"x" + myInt +":"+ (i*myInt) );
        }







    }
}
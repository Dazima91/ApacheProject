package basic;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        try {System.out.println("Enter first num:");
        int n1 = input.nextInt();

        System.out.println("Enter second num:");
        int n2 = input.nextInt();
        int Sum = n1/n2;
        System.out.println(Sum);
        }
        catch(Exception e) {
            System.out.println("The information you have entered in incorrect, Please enter the correct information");




        }







    }











}

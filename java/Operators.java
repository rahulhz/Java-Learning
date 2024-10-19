import java.util.Scanner;

public class Operators{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your 1st number: ");
        int a= input.nextInt();

        System.out.print("Enter Your 2nd number: ");
        int b= input.nextInt();

        int product = a*b;
        System.out.print("Product : "+ product);


    }
}
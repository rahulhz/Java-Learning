import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = input.nextInt();

        if(num>=90){
            System.out.print("Your Grade is : A ");
        }
        else if(num<=90 && num >=75){
            System.out.print("Your Grade is : B ");
            
        }
        else if(num<=75 && num >=60){
            System.out.print("Your Grade is : C ");
            
        }
        else if(num<=60 && num >=30){
            System.out.print("Your Grade is : D ");
            
        }
        else{
            System.out.print("You are fail ");

        }
    }
}
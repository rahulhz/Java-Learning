import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        System.out.print("Enter Your Number: ");
        int userNum = userValue();
        
        int factorial = oddNum(userNum);
        System.out.print("Your factorial is : " + factorial);


    }

    // Funtion for taking input from user
    public static int userValue(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    // Funtion for multiplication
    public static int oddNum(int num) {
       int i = num;
       int product = 1;
       while(i>=1){
        product = product* i;
        i--;
       }
       return product;

  }
}
        
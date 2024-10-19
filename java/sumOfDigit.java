import java.util.Scanner;

public class sumOfDigit{
    public static void main(String[] args){
        System.out.print("Enter Your Number: ");
        int userNum = userValue();
        
        int sum = sumOfDigit(userNum);
        System.out.print("Your sum of digit is : " + sum);


    }

    // Funtion for taking input from user
    public static int userValue(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    // Funtion for multiplication
    public static int sumOfDigit(int num) {
       int sum = 0;
        int i = num;
        while( i >0){
        int ld  = i%10;
        sum = sum + ld;
          i = i/10;
        }
        return sum;

  }
}
        
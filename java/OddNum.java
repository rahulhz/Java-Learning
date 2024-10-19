import java.util.Scanner;

public class OddNum{
    public static void main(String[] args){
        System.out.print("Enter Your Number: ");
        int userNum = userValue();
        
        int sum = oddNum(userNum);
        System.out.print("Your sum is : " + sum);


    }

    // Funtion for taking input from user
    public static int userValue(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    // Funtion for multiplication
    public static int oddNum(int num) {
        int i = 1;
        int sum =0;
        while(i<=num){
             sum += i;
            i += 2;
        }
        return sum;
    }

}
        
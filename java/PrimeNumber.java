import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean primeNumber = checkPrimeNumber(num);

        if(primeNumber == true){

        System.out.print("Your number is prime");
        }
        else{
            System.out.print("Your number is not prime");
        }
    }


    // funtction to check whether the number is prime or not;
    public static boolean checkPrimeNumber(int num){
        int number = 1;
        int i = 2;
        while(i<num){
            if(num % i == 0 ){
                return false;
            }
            i++;
        }
        return true;
    }
}
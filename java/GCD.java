import java.util.Scanner;

public class GCD{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the firs number: ");
            int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            int GCD = findgcd(num1, num2);
        System.out.print("The LCM of "+num1+" and "+num2 +" is: " + GCD);

    }

    // funtion for fing LCM

    public static int findgcd(int num1, int num2){
        int least = findLeastNum(num1,num2);
        int GCD =1;
        int i= 2;
        while(i<=least){
            if( num1 % i == 0 && num2 % i ==0){
                GCD = i;
            }
            i++;
        }
                return GCD;
    }

// funtion for finding the least number;
public static int findLeastNum(int num1, int num2){
    if(num1>num2){
        return num1;
    }
    else{
        return num2;
    }
}

}


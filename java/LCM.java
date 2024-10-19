import java.util.Scanner;

public class LCM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the firs number: ");
            int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            int LCM = findlcm(num1, num2);
        System.out.print("The LCM of "+num1+" and "+num2 +" is: " + LCM);

    }

    // funtion for fing LCM

    public static int findlcm(int num1, int num2){

        int i = 1;
        while(true){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
        
    }
}
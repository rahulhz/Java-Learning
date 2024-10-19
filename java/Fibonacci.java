import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number where you want to see the fibonacci series: ");
        int num = input.nextInt();
        fibonacciSeries(num);
    }

    // function for printing the fibonacci series;

    public static void fibonacciSeries(int num){
        int firstnum =0; int secondnum = 1;
        int thirdNum = 0;

    if(num<0 || num ==0){
        System.out.print("0 write bigger number");
    }
    else{

        while( firstnum + secondnum < num){
            thirdNum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = thirdNum;
            System.out.print(" "+thirdNum);
            
        }
    }
    }
}
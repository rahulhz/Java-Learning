import java.util.Scanner;

public class Table{
    public static void main(String[] args){
        System.out.print("Enter Your Number: ");
        int userNum = userValue();
        tables(userNum);

    }

    // Funtion for taking input from user
    public static int userValue(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    // Funtion for multiplication
    public static void tables(int num) {
        int tableNum = num;
        int i= 1;
        // StringBuilder result = new StringBuilder();
        while(i<=10){
            System.out.println(tableNum + " X " + i + " = " + tableNum*i);
            i++;
        }

        // return result.toString();
    }

}
        
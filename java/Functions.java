public class Functions  {
    public static void main(String[] args){
        // all code be written here...!
        greeting();
    }

    // Function will be written here
    public static void greeting(){
        // System.out.println("*");
        // System.out.println("* *");
        // System.out.println("* * *");
        // System.out.println("* * * *");
        // System.out.println("* * * * *");

        int rows = 0;
        while(rows<5){
            System.out.print("*");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
        System.out.println();

            rows++;
        }
    }
}
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double SUM=0;
        int COUNTER = 0;
        long AVG=0;
        while(true){
            //System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                COUNTER++;
                int number = scanner.nextInt();
                SUM += number;
                scanner.nextLine();
            } else break;

            AVG =  Math.round((double) (SUM/COUNTER));
        }

        System.out.println("SUM = " + (int) SUM + " AVG = " + AVG);
        //System.out.println("Counter = " + COUNTER);
        scanner.close();
    }
}

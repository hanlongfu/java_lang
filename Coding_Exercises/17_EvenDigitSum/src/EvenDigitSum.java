public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = 0, remainder;
        if(number < 0) return -1;
        while(number > 0){
            remainder = number % 10;
            number /= 10;
            if(remainder % 2 == 0){
                sum += remainder;
            }
        }
        return sum;
    }
}

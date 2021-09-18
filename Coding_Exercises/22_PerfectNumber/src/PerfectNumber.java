public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        if(num < 1) return false;
        int sum = 0, i = 1;
        while(i < num){
            if(num % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum == num;
    }
}

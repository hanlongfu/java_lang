public class GCD {
    public static int getGreatestCommonDivisor(int num1, int num2){
        if(num1 < 10 || num2 < 10) return -1;

        int max = 0;
        for (int i = 1; i < Math.max(num1, num2); i++) {
            if(num1 % i == 0 && num2 % i == 0) max = i;
        }
        return max;
    }
}

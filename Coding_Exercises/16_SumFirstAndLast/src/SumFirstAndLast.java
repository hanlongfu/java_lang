public class SumFirstAndLast {
    public static int sumFirstAndLastDigit(int number) {
        int last = number % 10;
        if (number < 0) return -1;
        else if (number < 10) return number*2;
        while (number >= 10) {
            number /= 10;
        }
        return last + number;
    }
}

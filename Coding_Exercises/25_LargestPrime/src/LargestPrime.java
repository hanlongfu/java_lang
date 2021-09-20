public class LargestPrime {
    public static int getLargestPrime(int number) {
        int max = 1;
        int idx = 1;
        if(number <=1) return -1;
        while (idx < number) {
           if(number % idx == 0 && idx > max && isPrime(idx)) {
              max = idx;
           }
           idx++;
        }
        return max;
    }

    //check if it is a prime number
    public static boolean isPrime(int number){
        boolean iPrime = false;
        int counter = 1;
        int numPrime = 0;
        while(counter <= number){
            if(number % counter == 0) {
                numPrime++;
            }
            counter++;
        }
        if(numPrime == 2) iPrime = true;
        return iPrime;
    }
}

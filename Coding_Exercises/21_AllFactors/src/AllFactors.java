public class AllFactors {
    public static void printFactors(int num){
        if(num < 1) {
            System.out.println("Invalid value");
            return;
        }
        for (int i = 1; i <=num; i++) {
            if((num % i) == 0) System.out.println(i);
        }
    }
}

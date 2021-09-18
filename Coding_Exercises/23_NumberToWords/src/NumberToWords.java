public class NumberToWords {
    public static void numberToWords(int number) {
        int originalNumber = number;
        number = reverse(number);
        int originalNumDigitCount = getDigitCount(originalNumber);
        int reversedNumDigitCount = getDigitCount(number);

        if(number == 0) System.out.println("Zero");

        int remainder = number % 10;  //extract the last digit
        if (number < 0) System.out.println("Invalid Value");
        while (number > 0) {
            switch (remainder) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10;
            remainder = number % 10;
        }
        if(originalNumDigitCount != reversedNumDigitCount){
            for(int i = 0; i < (originalNumDigitCount - reversedNumDigitCount); i++) {
                System.out.println("Zero");
            }
        }
    }

    //reverse a number
    public static int reverse(int number){
        int reverse=0;
        while(Math.abs(number)>0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }

    //get digit count
    public static int getDigitCount(int number){
        if(number < 0) return -1;
        if(number < 10) return 1;
        int idx = 0;
        while(number > 0){
            number /= 10;
            idx++;
        }
        return idx;
    }
}

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;
        int num1Last = num1 %10, num2Last = num2 % 10, num3Last = num3 % 10;
        if(num1Last == num2Last) return true;
        else if(num1Last == num3Last) return true;
        else return num2Last == num3Last;
    }

    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
}

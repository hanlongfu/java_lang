public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;
        int num1Last = num1 % 10, num2Last = num2 % 10, num1First = num1 / 10, num2First = num2/10;
        if(num1Last == num2Last) return true;
        else if(num1Last == num2First) return true;
        else if(num1First == num2Last) return true;
        else return num1First == num2First;
    }

}

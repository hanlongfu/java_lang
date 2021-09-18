public class Palindrome {
    public static boolean isPalindrome(int number){
      int originalNum = number, reverse = 0, remainder;
      while(number !=0){
          remainder = number % 10;
          reverse = reverse * 10 + remainder;
          number = number / 10;
      }
     return originalNum == reverse;
    }
}

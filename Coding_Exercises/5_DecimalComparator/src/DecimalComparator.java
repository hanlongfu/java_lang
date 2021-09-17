public class DecimalComparator {
  public static boolean areEqualByThreeDecimalPlaces(double parem1, double parem2){
    return Casting(parem1) == Casting(parem2);
  }
  public static int Casting(double num){
    return (int) (num * 1000);
  }
}

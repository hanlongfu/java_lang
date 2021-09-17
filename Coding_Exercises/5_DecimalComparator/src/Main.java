public class Main {
  public static void main(String[] args) {
    boolean result1 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.176, -3.175);
    System.out.println(result1);
    boolean result2 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
    System.out.println(result2);

  }
}

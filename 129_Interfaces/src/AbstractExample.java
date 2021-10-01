abstract class Super {
    public Super(){
        System.out.println("Super Constructor");
    }
    public void method1(){
        System.out.println("Method 1 of Super");
    }

    abstract public void method2();
}

class Sub extends Super{
    @Override
    public void method2() {
        System.out.println("Sub method 2!");
    }


}

public class AbstractExample {
    public static void main(String[] args) {
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}

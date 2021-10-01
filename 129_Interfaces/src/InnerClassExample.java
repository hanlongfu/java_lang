abstract class My{
    abstract void display();
}

class Outer{
    int x=10;

    Inner i = new Inner();
    //inner class
    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x + " " + y);
        }
    }

    //method
    public void outerDisplay(){
        //object of inner class
        i.innerDisplay();
        System.out.println(i.y);
    }

    //anonymous inner class
    public void method(){
        My m = new My(){
            public void display(){
                System.out.println("Hello");
            }
        };
        m.display();
    }

}



public class InnerClassExample {
    public static void main(String[] args) {
        //first create an object of outer and then create an object of inner
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

        Outer i2 = new Outer();
        i2.method();

    }
}

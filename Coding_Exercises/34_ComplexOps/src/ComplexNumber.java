public class ComplexNumber {
    private double real;
    private double imaginary;

    //constructor
    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //getters
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

    // additional methods
    public void add(double real, double imaginary){
        this.real = real + this.real;
        this.imaginary = imaginary + this.imaginary;
    }
    public void add(ComplexNumber complexNumber){
        this.real = complexNumber.getReal() + this.real;
        this.imaginary = complexNumber.getImaginary() + this.imaginary;
    }
    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }
    public void subtract(ComplexNumber complexNumber){
        this.real = this.real - complexNumber.getReal();
        this.imaginary = this.imaginary - complexNumber.getImaginary();
    }
}

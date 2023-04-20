package Lab1.src.lab4.Task2;

public class Complex {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double newReal = real + other.getReal();
        double newImaginary = imaginary + other.getImaginary();
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = real - other.getReal();
        double newImaginary = imaginary - other.getImaginary();
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = real * other.getReal() - imaginary * other.getImaginary();
        double newImaginary = real * other.getImaginary() + imaginary * other.getReal();
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        double divisor = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double newReal = (real * other.getReal() + imaginary * other.getImaginary()) / divisor;
        double newImaginary = (imaginary * other.getReal() - real * other.getImaginary()) / divisor;
        return new Complex(newReal, newImaginary);
    }

    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double argument() {
        return Math.atan2(imaginary, real);
    }

    public void printAlgebraic() {
        System.out.println(real + " + i*" + imaginary);
    }

    public void printTrigonometric() {
        System.out.println(modulus() + "*(cos(" + argument() + ") + i*sin(" + argument() + "))");
    }
}

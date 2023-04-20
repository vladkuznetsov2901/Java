package Lab1.src.lab4.Task2;

public class ComplexTest {
    public static void main(String[] args){
        Complex complex = new Complex(12.5, 2.5);
        Complex complex2 = new Complex(5.5, 18.2);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("First complex: ");
        complex.printAlgebraic();
        complex.printTrigonometric();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Second complex: ");
        complex2.printAlgebraic();
        complex2.printTrigonometric();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Add: ");
        Complex resultAdd = complex.add(complex2);
        resultAdd.printAlgebraic();
        resultAdd.printTrigonometric();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Subtract: ");
        Complex resultSub = complex.subtract(complex2);
        resultSub.printAlgebraic();
        resultSub.printTrigonometric();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Multiply: ");
        Complex resultMul = complex.multiply(complex2);
        resultMul.printAlgebraic();
        resultMul.printTrigonometric();

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Divide: ");
        Complex resultDiv = complex.divide(complex2);
        resultDiv.printAlgebraic();
        resultDiv.printTrigonometric();
        System.out.println("------------------------------------------------------------------------------------------");
    }


}

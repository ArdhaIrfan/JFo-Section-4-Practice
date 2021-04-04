import java.util.Scanner;

public class TestClass5026201110 {

    public static void main(String[] args) {
        int a, b;
        String c;
        Scanner scan = new Scanner(System.in);

        //Create an instance of ComputeMethods5026201110,
        ComputeMethods5026201110 result = new ComputeMethods5026201110();
        
	//invoke the 3 methods and display their results
        System.out.println("Temperature Converter\nInput temperature in Fahrenheit: ");
        result.fToC(scan.nextDouble());

        System.out.println("Hypotenuse Calculator");
        System.out.println("Input first side length (Integer only): ");
        a = scan.nextInt();
        System.out.println("Input second side length (Integer only): ");
        b = scan.nextInt();
        result.hypotenuse(a, b);

        System.out.println("Random Dice Generator\nInput any key to start");
        c = scan.next();
        result.roll();
    }
}

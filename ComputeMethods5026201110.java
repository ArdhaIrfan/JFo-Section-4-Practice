import java.util.Random;

public class ComputeMethods5026201110 {

    public double resultTemp, resultHypo;

    public double fToC(double degreesF){
        resultTemp = (degreesF-32)*5/9;
        System.out.println("The equivalent temperature in Celcius is: " + resultTemp + "\n");
        return resultTemp;
    }

    public double hypotenuse(int a, int b){
        resultHypo = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of the triangle is: " + resultHypo + "\n");
        return resultHypo;
    }

    public int roll(){
        Random dice = new Random();
        int rndm1 = dice.nextInt(6) + 1;
        System.out.println("Your first dice number is: " + rndm1);
        int rndm2 = dice.nextInt(6) + 1;
        System.out.println("Your second dice number is: " + rndm2);
        int sumRandom = rndm1 + rndm2;
        System.out.println("The sum of the two dice number is: " + sumRandom);
        return sumRandom;
    }
}


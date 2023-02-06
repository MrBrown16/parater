import java.util.Scanner;

public class input {
    double[] paraInput(){
        double[] input = new double[3];
        Scanner num = new Scanner(System.in);
        System.out.println("Side-A: ");
        double num1 = num.nextDouble();
        System.out.println("Side-B: ");
        double num2 = num.nextDouble(); 
        System.out.println("Angle: ");
        double num3 = num.nextDouble(); 
        num.close();
        input= new double[] {num1,num2,num3};
        return input;
    }
}

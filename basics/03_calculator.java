import java.util.Scanner;
public class main{
    public static void main(String[] args){
        double num1=0.0;
        double num2=0.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1=scanner.nextDouble();
        System.out.println("Enter second number: ");
        num2=scanner.nextDouble();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        if (num2!=0){
            System.out.println("Division: "+(num1/num2));
        } else{
            System.out.println("Division: Cannot divide by zero!");
        }
        System.out.println("Modulus: "+(num1%num2));
        scanner.close();
    }
}
import java.util.Scanner;
import java.lang.Math;
public class main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter length of the rectangle (in cm): ");
        double length =scanner.nextDouble();
        System.out.println("Enter width of the rectangle (in cm): ");
        double width =scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of the rectangle: " + area + " cm²");
        System.out.println("Perimeter of the rectangle: " + perimeter + " cm");
        System.out.println("Enter radius of the circle (in cm): ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;  
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area of the circle: " + circleArea + " cm²");
        System.out.println("Circumference of the circle: " + circumference + " cm");
        scanner.close();
    }
}
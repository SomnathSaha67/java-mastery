import java.util.Scanner;
public class main{
    public static void main(String[] args){
        String name="";
        String city="";
        int age=0;
        String fav_subject="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=scanner.nextLine();
        System.out.println("Enter your city: ");
        city=scanner.nextLine();
        System.out.println("Enter your age: ");
        age=scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter your favorite subject: ");
        fav_subject=scanner.nextLine();
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Age: "+age);
        System.out.println("Favorite Subject: "+fav_subject);
        scanner.close();
    }
}
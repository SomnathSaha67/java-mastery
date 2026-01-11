public class Car{
    String brand;
    String model;
    int year;
    double price;
    int mileage;
    Car(String brand, String model, int year, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = 0;
    }Car(String brand, String model, int year, double price, int mileage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }void displayCarDetails(){  
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Mileage: " + mileage + " km");
    }void isNewCar(){
        if (mileage==0){
            System.out.println(brand + " " + model + " is a new car.");
        }else{
            System.out.println(brand + " " + model + " is a used car.");
        }
    }void drive(int km){
        mileage += km;
        System.out.println("You have driven " + km + " km. Total mileage is now " + mileage + " km.");
    }void calculateDepreciation(int currentYear){
        int age = currentYear - year;
        double depreciationRate = 0.15; 
        double depreciatedValue = price * Math.pow((1 - depreciationRate), age);
        System.out.println("The depreciated value of the car is: $" + String.format("%.2f", depreciatedValue));
    }void getCarAge(int currentYear){
        int age = currentYear - year;
        System.out.println("The car is " + age + " years old.");
    }
}
public class CarShowroomDemo{
    public static void main(String[] args){
        Car car1 = new Car("Toyota", "Camry", 2022, 24000);
        Car car2 = new Car("Honda", "Civic", 2020, 20000, 15000);
        car1.displayCarDetails();
        car1.isNewCar();
        car1.drive(100);
        car1.calculateDepreciation(2024);
        car1.getCarAge(2024);
        System.out.println();
        car2.displayCarDetails();
        car2.isNewCar();
        car2.drive(200);
        car2.calculateDepreciation(2024);
        car2.getCarAge(2024);
    }
}
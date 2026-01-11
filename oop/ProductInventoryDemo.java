public class Product{
    String productID;
    String productName;
    String category;
    double price;
    int stockQuantity;
    Product(String productID, String productName, String category, double price, int stockQuantity){
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }Product(String productName, String category, double price){
        this.productID = "AUTO-"+ productName;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = 0;
    }void displayProductDetails(){  
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }void updateStock(int quantity){
        stockQuantity += quantity;
        System.out.println("Updated stock quantity: " + stockQuantity);
    }void sellProduct(int quantity){
        if (quantity > stockQuantity){
            System.out.println("Insufficient stock to sell " + quantity + " units of " + productName);
        }else{
            stockQuantity -= quantity;
            System.out.println("Sold " + quantity + " units of " + productName);
        }
    }void isinStock(){
        if (stockQuantity > 0){
            System.out.println(productName + " is in stock.");
        }else{
            System.out.println(productName + " is out of stock.");
        }
    }void applyOffer(double discountPercentage){
        double discountAmount = price * (discountPercentage / 100);
        double newPrice = price - discountAmount;
        System.out.println("The new price after " + discountPercentage + "% discount is: $" + String.format("%.2f", newPrice));
    }void getTotalValue(){
        double totalValue = price * stockQuantity;
        System.out.println("Total value of " + productName + " in stock: $" + String.format("%.2f", totalValue));
    }
}
public class ProductInventoryDemo{
    public static void main(String[] args){
        Product product1 = new Product("P001", "Laptop", "Electronics", 1200.0, 10);
        Product product2 = new Product("Smartphone", "Electronics", 800.0);
        product1.displayProductDetails();
        product1.updateStock(5);
        product1.sellProduct(3);
        product1.isinStock();
        product1.applyOffer(10);
        product1.getTotalValue();
        System.out.println();
        product2.displayProductDetails();
        product2.updateStock(20);
        product2.sellProduct(25);
        product2.isinStock();
        product2.applyOffer(15);
        product2.getTotalValue();
    }
}
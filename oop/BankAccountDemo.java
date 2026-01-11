import java.util.Scanner;
public class BankAccount{
    Scanner scanner = new Scanner(System.in);
    String accountholdername;
    String accountnumber;
    double balance;
    BankAccount(String accountholdername, String accountnumber, double initialbalance){
        this.accountholdername = accountholdername;
        this.accountnumber = accountnumber;
        this.balance = initialbalance;
    }BankAccount(String accountholdername, String accountnumber){
        this.accountholdername = accountholdername;
        this.accountnumber = accountnumber;
        this.balance = 0.0;
    }BankAccount(String accountholdername){
        this.accountholdername = accountholdername;
        this.accountnumber = "0000000000";
        this.balance = 0.0;
    }double amountDeposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposited: " + amount);
        return balance;
    }void amountWithdraw(){
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > balance){
            System.out.println("Insufficient balance.");
        }else{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }void checkBalance(){
        System.out.println("Current balance: " + balance);
    }void displayAccountDetails(){
        System.out.println("Account Holder Name: " + accountholdername);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountDemo{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("John Doe", "1234567890", 500.0);
        BankAccount account2 = new BankAccount("Jane Smith", "0987654321");
        BankAccount account3 = new BankAccount("Alice Johnson");
        account1.displayAccountDetails();
        account1.amountDeposit();
        account1.checkBalance();
        account1.amountWithdraw();
        account1.checkBalance();
        System.out.println();
        account2.displayAccountDetails();
        account2.amountDeposit();
        account2.checkBalance();
        account2.amountWithdraw();
        account2.checkBalance();
        System.out.println();
        account3.displayAccountDetails();
        account3.amountDeposit();
        account3.checkBalance();
        account3.amountWithdraw();
        account3.checkBalance();
    }
}
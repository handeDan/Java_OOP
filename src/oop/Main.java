import Encapsulation.BankAccount;
import Inheritance.Bike;
import Inheritance.Car;

public class Main {
    public static void main(String[] args) {
        //encapsulation:
        BankAccount myAccount = new BankAccount(1000);
        myAccount.deposit(500);
        System.out.println("Balance: $" + myAccount.getBalance());

        myAccount.withdraw(200);
        System.out.println("Balance: $" + myAccount.getBalance());

        //inheritance:
        Bike myBike = new Bike("Honda", 50, true);
        myBike.wheelie();
        myBike.move();

        Car myCar = new Car("Hyundai", 120,4);
        myCar.move();
        myCar.honk();
    }
}
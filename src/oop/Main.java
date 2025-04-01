import com.oop.composition.Bus;
import com.oop.composition.Engine;
import com.oop.encapsulation.BankAccount;
import com.oop.inheritance.Bike;
import com.oop.inheritance.Car;

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

        //composition:
        Engine myEngine = new Engine("V8", 500);
        myEngine.start();

        Bus myBus = new Bus("Mercedes", 80, myEngine);
        myBus.startBus();
    }
}
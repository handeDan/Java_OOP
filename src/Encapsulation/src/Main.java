public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000);
        myAccount.deposit(500);
        System.out.println("Balance: $" + myAccount.getBalance());

        myAccount.withdraw(200);
        System.out.println("Balance: $" + myAccount.getBalance());
    }
}
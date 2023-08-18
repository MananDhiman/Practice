class BankAccount {
    String accountHolderName;
    int balance;

    BankAccount(String name, int balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    void deposit(int amount) {
        this.balance += amount;
        System.out.println(amount + " deposited. Current Balance "+this.balance);
    }

    void withdraw(int amount) {
        this.balance -= amount;
        System.out.println(amount + " withdrawn. Current Balance "+this.balance);
    }
    
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, int balance) {
        super(name, balance);
    }

    @Override void withdraw(int amount) {
        if(amount > this.balance) {
            System.out.println("cannot withdraw");
            
            return;
        }
        this.balance -= amount;
        System.out.println(amount + " withdrawn. Current Balance "+this.balance);
    }
}

public class j5 {
    public static void main(String[] args) {
        BankAccount bAccount = new BankAccount("Manan", 40000);
        bAccount.deposit(10000);
        bAccount.withdraw(100000);

        SavingsAccount savingsAccount = new SavingsAccount("A", 250);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(400);
    }
}

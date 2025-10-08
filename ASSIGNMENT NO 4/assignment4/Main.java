// Abstract class
abstract class BankAccount {
    public abstract void deposite();
    public abstract void withdrawl();
    public abstract void GetBalance();

    public void getDetails() {
        System.out.println("Name, MobileNo, Address etc");
    }
}

// SavingAccount class
class SavingAccount extends BankAccount {
    
    public void deposite() {
        System.out.println("The amount deposited is 1000");
    }

    
    public void withdrawl() {
        System.out.println("The amount withdrawn is 2000");
    }

    
    public void GetBalance() {
        System.out.println("The amount of balance available is 5000");
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
    
    public void deposite() {
        System.out.println("The amount deposited is 3000");
    }

    
    public void withdrawl() {
        System.out.println("The amount withdrawn is 5000");
    }

    
    public void GetBalance() {
        System.out.println("The amount of balance available is 10000");
    }
}

// Main class
public class Main {
    public static void main(String args[]) {
        SavingAccount s = new SavingAccount();
        CurrentAccount d = new CurrentAccount();

        s.deposite();
        s.withdrawl();
        s.GetBalance();
        s.getDetails();

        d.deposite();
        d.withdrawl();
        d.GetBalance();
        d.getDetails();
    }
}

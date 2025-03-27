package LAB_7;

interface Wallet {
    void addFunds(double amount);
    void spendFunds(double amount);
}

class DigitalWallet implements Wallet {
    private double balance = 0;

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: " + amount + ", New Balance: " + balance);
        }
    }

    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class WalletDemo {
    public static void main(String[] args) {
        DigitalWallet myWallet = new DigitalWallet();
        myWallet.addFunds(100);
        myWallet.spendFunds(30);
        myWallet.spendFunds(80);
    }
}

package LAB_4;

class Customer {
    private double balance;

    public Customer(double initialBalance) {
        this.balance = initialBalance;
    }
 
    public Customer() {
        this.balance = 0.0;
    }
    
    public void addBalance(double amount) {
        balance += amount;
    }
   
    public void addBalance(int amount) {
        balance += amount;
    }
    
    protected void deductBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(100.0); 
        Customer customer2 = new Customer(); 

        customer1.addBalance(50.25);
        customer1.addBalance(25); 
        customer1.showBalance(); 

        customer1.deductBalance(30);
        customer1.showBalance(); 

        customer2.addBalance(500);
        customer2.showBalance(); 
    }
}

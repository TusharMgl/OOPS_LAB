package LAB_6;

class TaxCalculator {
    
    double GST_RATE = 18.0;
        public void displayGST() {
                System.out.println("The GST rate is: " + GST_RATE + "%");
            }
        }
        class Invoice extends TaxCalculator {
        
            public double calculateTotalWithTax(double amount) {
                double taxAmount = (amount * GST_RATE) / 100;
                return amount + taxAmount;
            }    
            @Override
            public void displayGST() { 
                System.out.println("Trying to override final method."); 
            }
        
        public void changeGST() {
            GST_RATE = 20.0;
    }
    
}
public class TaxationTest {
    public static void main(String[] args) {
        
        Invoice myInvoice = new Invoice();
        myInvoice.displayGST();        
        double amount = 1425.0;
        double totalAmount = myInvoice.calculateTotalWithTax(amount);
        System.out.println("Total amount after applying GST on " + amount + " is: " + totalAmount);
    }
}


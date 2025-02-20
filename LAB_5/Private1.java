package LAB_5;

class Superclass {
    private int privateVar = 10; 

    public int getPrivateVar() { 
        return privateVar;
    }
}

class Subclass extends Superclass {
    public void display() {
  
        System.out.println("Private variable (accessed via getter): " + getPrivateVar());
    }
}

public class Private {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
    }
}

package LAB_7;

interface Remote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

class Television implements Remote {
  
    public void powerOn() {
        System.out.println("TV is now ON.");
    }
    
    public void powerOff() {
        System.out.println("TV is now OFF.");
    }
    
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}

public class RemoteDemo {
    public static void main(String[] args) {
        Remote tv = new Television();
        tv.powerOn();
        tv.changeChannel(5);
        tv.powerOff();
    }
}

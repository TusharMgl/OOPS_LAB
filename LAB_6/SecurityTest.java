package LAB_6;

class SecuritySystem {
    public void authenticateUser(String username, String password) {
        String validUsername = "admin";
        String validPassword = "secure123";

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Authentication successful! ");
        } else {
            System.out.println("Authentication failed! ");
        }
    }
}
class AdvancedSecurity extends SecuritySystem {
    @Override
    public void authenticateUser(String username, String password) {
        System.out.println("Trying to override authentication logic...");
    }
}
public class SecurityTest {
    public static void main(String[] args) {
       
        SecuritySystem security = new SecuritySystem();
        security.authenticateUser("admin", "secure123");
        security.authenticateUser("user", "wrongpass");
    }
}

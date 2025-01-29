import java.util.*;

class calculator{
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter first number");
        int a = S.nextInt();
        System.out.println("enter second number");
        int b = S.nextInt();
        System.out.println("enter operation among + - * % /");
        char op = S.next().charAt(0);

        switch(op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid");
         }
    }
}
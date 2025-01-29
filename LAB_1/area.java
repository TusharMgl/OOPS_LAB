public class area {

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public int calculateArea(int side) {
        return side * side;
    }


    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        area calculator = new area();

       
        System.out.println("Area of Rectangle: " + calculator.calculateArea(10, 5));
        System.out.println("Area of Square: " + calculator.calculateArea(4) );
        System.out.println("Area of Circle: " + calculator.calculateArea(3.0f) );
        System.out.println("Area of Triangle: " + calculator.calculateArea(6.0, 8.0, true));
    }
}
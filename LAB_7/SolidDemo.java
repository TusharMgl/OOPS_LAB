package LAB_7;


abstract class Solid {
    abstract double calculateVolume();
}

class Cuboid extends Solid {
    private double length, width, height;
    
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    double calculateVolume() {
        return length * width * height;
    }
}

class Sphere extends Solid {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }

    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class SolidDemo {
    public static void main(String[] args) {
        Solid cuboid = new Cuboid(3, 4, 5);
        Solid sphere = new Sphere(2);
        
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
    }
}



package LAB_5;

class Person {
    protected String name;
    protected int age;
    protected String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Display method (can be overridden)
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Staff extends Person {
    protected String staffId;
    protected String department;

    // Constructor
    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

class Professor extends Staff {
    private String specialization;

    // Constructor
    public Professor(String name, int age, String address, String staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    // Method specific to Professor
    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization + ".");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}
class Student extends Person {
    protected String studentId;
    protected String course;

    // Constructor
    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}
class GraduateStudent extends Student {
    private String researchTopic;

    // Constructor
    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    // Method specific to GraduateStudent
    public void submitThesis() {
        System.out.println(name + " has submitted a thesis on " + researchTopic + ".");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Research Topic: " + researchTopic);
    }
}
public class UniversityTest3 {
    public static void main(String[] args) {
        // Create instances
        Professor prof = new Professor("Dr. Smith", 45, "123 University St", "P101", "Computer Science", "Artificial Intelligence");
        GraduateStudent gradStudent = new GraduateStudent("Tushar", 19, "456 Campus Rd", "S202", "MSc Computer Science", "Machine Learning in Healthcare");

        // Array of Person objects (Polymorphism)
        Person[] people = {prof, gradStudent};

        // Loop through and call display methods
        System.out.println("University Members Information:");
        for (Person p : people) {
            p.display();
            System.out.println();  // For spacing

            // Check instance type and call specific methods
            if (p instanceof Professor) {
                ((Professor) p).conductLecture();
            } else if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
            System.out.println("-------------------------------------------------");
        }
    }
}


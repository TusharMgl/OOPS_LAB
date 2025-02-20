package LAB_5;

class Employee {
    protected String name;
    protected int empid;
    protected double salary;

    
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

  
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

   
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    
    public void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;

   
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}
public class TestProgram2 {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Tushar", 101, 50000);
        System.out.println("Before Salary Increase:");
        emp.display();

        
        emp.increaseSalary(15);
        System.out.println("\nAfter 15% Salary Increase:");
        emp.display();

       
        Manager mgr = new Manager("Mehul", 102, 70000, "IT");
        System.out.println("\nManager Details:");
        mgr.display();

        
        mgr.increaseSalary(20);
        System.out.println("\nAfter 20% Salary Increase:");
        mgr.display();
    }
}


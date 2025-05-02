import java.util.ArrayList;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class l9q2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Tushar", 101, 52000));
        employees.add(new Employee("Bhavya", 105, 50000));
        employees.add(new Employee("Tilak", 107, 63000));

        for (Employee e : employees) {
            if (e.id == 101) {
                e.salary = 58000;
            }
        }
        employees.removeIf(e -> e.id == 103);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

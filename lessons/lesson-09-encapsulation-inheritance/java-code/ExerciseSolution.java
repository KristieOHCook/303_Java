// SOLUTION: Employee → Manager hierarchy

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("Employee[%s, id=%d, salary=%.0f]", name, id, salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);  // call parent constructor
        this.department = department;
    }

    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return String.format("Manager[%s, id=%d, salary=%.0f, dept=%s]",
                getName(), getId(), getSalary(), department);
    }
}

public class ExerciseSolution {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 1, 50000);
        Employee e2 = new Employee("Charlie", 3, 55000);
        Manager m1 = new Manager("Bob", 2, 80000, "Engineering");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(m1);

        // instanceof
        System.out.println(m1 instanceof Manager);   // true
        System.out.println(m1 instanceof Employee);   // true
        System.out.println(e1 instanceof Manager);    // false
    }
}

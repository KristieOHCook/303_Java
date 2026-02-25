// Java — Encapsulation (private fields + getters/setters)

public class Encapsulation {

    // Private fields — cannot be accessed from outside the class
    private String name;
    private int age;

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.setAge(age);  // use setter for validation even in constructor
    }

    // Getter — read access
    public String getName() {
        return name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter — write access WITH VALIDATION
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    // Setter
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }
        this.name = name;
    }

    @Override  // Java annotation — tells compiler "I'm overriding a parent method"
    public String toString() {
        return name + ", age " + age;
    }

    public static void main(String[] args) {
        Encapsulation p = new Encapsulation("Alice", 30);
        System.out.println(p);            // calls toString()
        System.out.println(p.getName());  // "Alice"
        // p.name = "Bob";  ← ERROR! name is private
        p.setName("Bob");                 // use setter
        p.setAge(-5);                     // Invalid! validation catches it
        System.out.println(p);
    }
}

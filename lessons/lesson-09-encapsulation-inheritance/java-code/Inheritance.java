// Java — Inheritance (extends + super)

// Parent class
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public String getInfo() {
        return name + ", age " + age;
    }
}

// Child class — EXTENDS parent (same keyword as JS!)
class Student extends Person {
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);    // MUST call parent constructor — same as JS!
        this.gpa = gpa;
    }

    public double getGPA() { return gpa; }

    // Override parent method — @Override annotation is required
    @Override
    public String getInfo() {
        return super.getInfo() + ", GPA: " + gpa;  // call parent's version with super
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p.getInfo());           // "Alice, age 30"

        Student s = new Student("Bob", 20, 3.8);
        System.out.println(s.getInfo());           // "Bob, age 20, GPA: 3.8"
        System.out.println(s.getName());           // inherited from Person!

        // instanceof — same as JS!
        System.out.println(s instanceof Student);  // true
        System.out.println(s instanceof Person);   // true (Student IS a Person)
    }
}

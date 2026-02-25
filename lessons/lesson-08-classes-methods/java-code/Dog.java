// Java — Classes

public class Dog {

    // Fields (declared with types — JS doesn't require this)
    String name;
    int age;

    // Constructor (uses the CLASS NAME, not "constructor")
    public Dog(String name, int age) {
        this.name = name;    // same "this" concept as JS
        this.age = age;
    }

    // Method — must declare return type!
    // "void" = returns nothing (like a JS function with no return)
    public void bark() {
        System.out.println(name + " says Woof!");
    }

    // Method with return type
    public String getInfo() {
        return name + " is " + age + " years old";
    }

    // Static method — belongs to the class, not instances
    public static void describe() {
        System.out.println("Dogs are loyal animals");
    }

    // METHOD OVERLOADING — same name, different parameters!
    // JS CANNOT do this.
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name + " says Woof!");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog("Rex", 3);
        d.bark();              // calls bark()
        d.bark(3);             // calls bark(int times) — overloaded!
        System.out.println(d.getInfo());
        Dog.describe();        // static — called on the class
    }
}

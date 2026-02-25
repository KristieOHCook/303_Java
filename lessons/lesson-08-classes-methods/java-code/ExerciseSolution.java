// SOLUTION: Student class

public class ExerciseSolution {

    String name;
    int[] grades;

    public ExerciseSolution(String name, int numberOfClasses) {
        this.name = name;
        this.grades = new int[numberOfClasses];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 0;
        }
        System.out.println("Student " + name + " enrolled in " + numberOfClasses + " classes");
    }

    public void addGrade(int index, int grade) {
        if (index < 0 || index >= grades.length) {
            System.out.println("Invalid class index: " + index);
            return;
        }
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade: " + grade + " (must be 0-100)");
            return;
        }
        grades[index] = grade;
        System.out.println(name + " received " + grade + " in class " + index);
    }

    public double calculateGPA() {
        double sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    public static void main(String[] args) {
        ExerciseSolution student = new ExerciseSolution("Alice", 5);
        student.addGrade(0, 95);
        student.addGrade(1, 87);
        student.addGrade(2, 92);
        student.addGrade(3, 78);
        student.addGrade(4, 88);
        System.out.printf("%s's GPA: %.2f%n", student.name, student.calculateGPA());

        // Test validation
        student.addGrade(10, 95);   // invalid index
        student.addGrade(0, 150);   // invalid grade
    }
}

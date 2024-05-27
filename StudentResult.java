import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Roll Number:");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        
        MarksDetails student = new MarksDetails(rollNumber, name);
        student.inputMarks();
        
        System.out.println("\nStudent Details:");
        student.displayDetails();
        
        System.out.println("\nResult:");
        student.displayResult();
    }
}
class Student {
    protected int rollNumber;
    protected String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

class MarksDetails extends Student {
    private int[] marks = new int[5];

    public MarksDetails(int rollNumber, String name) {
        super(rollNumber, name);
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void displayResult() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = totalMarks / 5.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}



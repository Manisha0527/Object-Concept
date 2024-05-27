import java.util.Scanner;

public class NumberSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Swap numberSwapper= new Swap(num1, num2);

        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        numberSwapper.swapNumbers();
        numberSwapper.displayNumbers();

        scanner.close();
    }
}


class Swap {
    int num1, num2;

    Swap(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void swapNumbers() {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }

    void displayNumbers() {
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}


import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the side length of the equilateral triangle: ");
        double side = scanner.nextDouble();

        // Calculate the area
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);

        // Display the result
        System.out.println("The area of the equilateral triangle is: " + area);

        scanner.close();
    }
}
import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        int smallest = Math.min(num1, Math.min(num2, num3));
        
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("--------------------");
        System.out.println("Smallest value: " + smallest);
        System.out.println("Largest value: " + largest);
        System.out.println("--------------------");
        System.out.println("The largest number is =" + largest);
        System.out.println("the smallest number is = " + smallest);
    }
}
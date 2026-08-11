import java.util.Scanner;

public class FullAdder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A (0 or 1): ");
        int A = sc.nextInt();

        System.out.print("Enter B (0 or 1): ");
        int B = sc.nextInt();

        System.out.print("Enter Carry Input (0 or 1): ");
        int Cin = sc.nextInt();

        int sum = A ^ B ^ Cin;
        int carry = (A & B) | (B & Cin) | (A & Cin);

        System.out.println("Sum = " + sum);
        System.out.println("Carry = " + carry);

        sc.close();
    }
}
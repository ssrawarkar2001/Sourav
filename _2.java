package MultiplyofTwoNumber;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        int A, B, multi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");

        A = sc.nextInt();
        B = sc.nextInt();

        multi = A*B;
        System.out.println(" Ans = " + multi);

    }
}

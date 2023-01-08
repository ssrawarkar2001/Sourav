package MultiplyofTwoNumber;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int multi;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your value");

        A = Sc.nextInt();
        B = Sc.nextInt();
        C = Sc.nextInt();

        System.out.println("Ans = " + A*B*C);
    }
}

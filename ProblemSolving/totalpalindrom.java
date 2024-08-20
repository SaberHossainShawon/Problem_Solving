package ProblemSolving;

import java.util.Scanner;

public class totalpalindrom {
    public static void Main() {
        Scanner input = new Scanner(System.in);
        int m, n, sum = 0, temp, r, totalpalindrom = 0;
        System.out.print("Enter your First Number=");
        m = input.nextInt();
        System.out.print("Enter your Last Number=");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (i == sum ) {
                System.out.println(i);
                totalpalindrom++;
            }
            sum = 0;
        }
        System.out.println("Total Palindrom Number="+totalpalindrom);
    }

    public static void main(String[] args) {
        Main();
    }
}

package ProblemSolving;

import java.util.Scanner;

public class totalArmstrongNumber {
    public static void Main() {
        int m, n, sum = 0, r, temp, totalArmstrong = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First Number=");
        m = input.nextInt();
        System.out.print("Enter your last Number=");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum = sum + r * r * r;
                temp = temp / 10;
            }
            if (i == sum) {
                System.out.println(i);
                totalArmstrong++;
            }
             sum=0;
        }
        System.out.println("Total Armstrong Number="+totalArmstrong);
    }

    public static void main(String[] args) {
        Main();
    }
}

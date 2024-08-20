package ProblemSolving;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Integer :");
        int num = input.nextInt();
        int r;
        int sum = 0;

        while (num != 0) {
            r = num % 10;
            sum=sum*10+r;
            num=num/10;
        }
        System.out.println(sum);
    }
}

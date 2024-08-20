package ProblemSolving;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String :");
        String num = input.nextLine();
        String rev = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            rev += num.charAt(i);
        }
        System.out.println(rev);
    }

}

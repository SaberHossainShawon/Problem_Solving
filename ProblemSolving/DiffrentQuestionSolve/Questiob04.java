package ProblemSolving.DiffrentQuestionSolve;

//Question 04--Calculate factorial value of a number--------.

import java.util.Scanner;

public class Questiob04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num= input.nextInt();
        int fac=1;
        for (int i = 1; i <=num ; i++) {
            fac*=i;
        }
        System.out.println("factoriyal number : "+fac);
    }
}

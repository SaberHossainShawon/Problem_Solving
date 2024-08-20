package ProblemSolving.DiffrentQuestionSolve;

// Question 01--Find out the conditional Sum until input (-1)-----.

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int a= 0;
        int sum=0;
        while (a != -1){

            sum=sum+a;
            System.out.print("Enter your number :");
            a= input.nextInt();
        }
        System.out.println("sum :"+sum);
    }
}

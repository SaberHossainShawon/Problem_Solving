package ProblemSolving.HacerRang_Problem;

//------Java Output formatting----------


import java.util.Scanner;
public class Question_05 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Input :");
        System.out.println("==============================");

        for (int i = 0; i < 3; i++) {
            String s = input.next();
            int x = input.nextInt();
            System.out.printf("%n%-15s%03d%n", s, x);
        }

        System.out.println("==============================");
    }
}

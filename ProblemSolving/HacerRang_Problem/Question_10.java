package ProblemSolving.HacerRang_Problem;

import java.util.Scanner;

//-----------java Int To String-----------------
public class Question_10 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int n=input.nextInt();
        String s=Integer.toString(n);
        if(s.equals(Integer.toString(n))){
            System.out.println("Good Job");
        }else {
            System.out.println("Wrong answer");
        }
    }
}

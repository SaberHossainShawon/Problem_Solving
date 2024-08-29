package ProblemSolving.HacerRang_Problem;

import java.util.Scanner;

//----------------java String Introduction------------------
public class Question_13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your String Value with Speech");
        String A=input.nextLine();
        String B=input.nextLine();

        System.out.println(A.length()+B.length());
        if(A.length()<B.length()){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
        System.out.println(A+" "+B);

    }
}

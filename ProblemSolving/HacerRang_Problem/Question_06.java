package ProblemSolving.HacerRang_Problem;
//------------------java loops 1--------------------
import java.util.Scanner;
public class Question_06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Number ;");
        int a= input.nextInt();
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(a+" * "+i+" ="+a*i);
        }
    }
}

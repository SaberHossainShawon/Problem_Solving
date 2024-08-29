package ProblemSolving.HacerRang_Problem;
//-------------java loop 2----------------------
import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 3 number with speech :");
        int a=input.nextInt();
        int b=input.nextInt();
        int n= input.nextInt();
        int result=0;
        int print_result;

        for (int i = 0; i <n ; i++) {
            result += (int)(Math.pow(2,i)*b);
            print_result = result+a;
            System.out.print(print_result+" ");
        }



    }
}

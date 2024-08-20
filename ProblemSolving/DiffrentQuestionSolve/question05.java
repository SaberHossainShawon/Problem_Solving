package ProblemSolving.DiffrentQuestionSolve;

import java.util.Scanner;

//Check prime number using Scanner----------

public class question05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=input.nextInt();
        if(num==1 || num==0){
            System.out.println(num+" Not Prime");
        }else {
            for (int i = 2; i <num ; i++) {
                if(num%i==0) {
                    System.out.println(num + " Prime Number");
                    return;
                }
            }
            System.out.println(num+" Not prime Number ");
        }

    }
}

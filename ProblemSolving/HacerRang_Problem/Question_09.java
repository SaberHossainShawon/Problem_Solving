package ProblemSolving.HacerRang_Problem;

import java.sql.SQLOutput;
import java.util.Scanner;

//----------java Static initializer Block---------------------
public class Question_09 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Height and Height must be getter then 0 :");
        int H=input.nextInt();
        System.out.println("Enter your Breadth and Breadth must be getter then 0 :");
        int B=input.nextInt();

        if(H<0 || B<0){
            try{
                throw new Exception("Breadth and height must be positive");
            }catch (Exception e){
                System.out.println(e);
            }
            return;
        }

        System.out.println(H*B);

    }
}

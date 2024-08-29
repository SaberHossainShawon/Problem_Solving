package ProblemSolving.HacerRang_Problem;
//-------------java End-Of-File------------------------

import java.util.Scanner;
public class Question_08 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your String Value : ");
        for(int i=1;input.hasNext();i++){
            String a=input.nextLine();
            System.out.printf("%n"+i+" "+a);
        }
        input.close();
    }
}

package ProblemSolving.HacerRang_Problem;

import java.sql.SQLOutput;
import java.util.Scanner;

//------------Java SubString----------------
public class Question_14 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter your String : ");
        String A=input.nextLine();

        System.out.println("Enter your start number :");
        int start= input.nextInt();

        System.out.println("Enter your end Number : ");
        int end=input.nextInt();

        System.out.println(A.substring(start,end));


    }
}

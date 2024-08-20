package ProblemSolving;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int num= input.nextInt();
        if(num==1  || num==0){
            System.out.println(num +" Not Prime");
            return;
        }
        for (int i = 2; i <num ; i++) {
             if(num%i==0){
                 System.out.println(num +" Prime Number");
                 return;
             }
        }
        System.out.println(num +" Not Prime");
    }
}

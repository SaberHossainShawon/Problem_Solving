package ProblemSolving;

import java.util.Scanner;

public class IntegerToRomanNumerals {
    public static void main(String[] args) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
         String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number :");
        int num= input.nextInt();
        System.out.print("Roman :");
        for (int i = 0; i <values.length ; i++) {
            while (num>=values[i]){
                System.out.print(roman[i]);
                num-=values[i];
            }
        }
    }
}

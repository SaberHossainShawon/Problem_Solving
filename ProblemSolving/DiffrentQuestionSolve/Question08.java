package ProblemSolving.DiffrentQuestionSolve;

//Check the largest number among the three numbers------------------.

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int[] array=new int[3];

        System.out.println("Enter your Three Number");
        for (int i = 0; i <array.length ; i++) {
            array[i]=input.nextInt();
        }

        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }

        System.out.println("Max Value Is : "+max);


    }
}

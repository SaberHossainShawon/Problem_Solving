package ProblemSolving.DiffrentQuestionSolve;

//Question 02--Print an Array and sum of the Array elements--------.

import java.util.Arrays;

public class Question02 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum Of Array :"+sum);
    }
}

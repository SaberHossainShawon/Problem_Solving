package ProblemSolving.DiffrentQuestionSolve;

//Question 01---Print an 2d Array and sum of the Array elements. [[1,2], [3,4], [5,6]]-------

import java.util.Arrays;

public class Question03 {
    public static void main(String[] args) {
        int[][]arr={{1,2},{3,4,},{5}};
        int sum=0;
        System.out.println(Arrays.deepToString(arr));
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                sum+=arr[row][col];
            }
        }
        System.out.println("Sum :"+sum);
    }
}

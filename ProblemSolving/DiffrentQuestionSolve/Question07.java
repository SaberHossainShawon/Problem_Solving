package ProblemSolving.DiffrentQuestionSolve;

//2d Array Sorting ascending or descending order-----------------.

import java.util.Arrays;

public class Question07 {
    public static void main(String[] args) {
        // Main();
        Main2();
    }

    public static void Main() {
        int[][] arr = {{23, 12, 5}, {1, 7, 4}, {19, 3, 16}};

        for (int[] x : arr) {
            // System.out.print(Arrays.toString(x));
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x.length - 1; j++) {
                    if (x[j] > x[j + 1]) {
                        int temp = x[j];
                        x[j] = x[j + 1];
                        x[j + 1] = temp;
                    }
                }
            }

        }
        System.out.print(Arrays.deepToString(arr));
    }

    public static void Main2() {
        int[][] arr = {{23, 12, 5}, {1, 7, 4}, {19, 3, 16}};
        for (int[] x : arr) {
            Arrays.sort(x);
            
//            for (int i = 0; i < x.length; i++) {
//                System.out.print(x[i] + " ");
//            }

//            for (int i = x.length-1; i >= 0; i--) {
//                System.out.print(x[i]+" ");
//            }

        }
        System.out.println();
        System.out.print(Arrays.deepToString(arr));
    }
}

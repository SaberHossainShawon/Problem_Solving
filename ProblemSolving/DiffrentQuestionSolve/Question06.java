package ProblemSolving.DiffrentQuestionSolve;

//Array Sorting ascending or descending order-----------.

import java.util.Arrays;

public class Question06 {
    public static void main(String[] args) {
        Main();
        //Main2();

    }

    public static void Main(){
        int[] arr={12,4,7,23,22,18,9,33,10};
        Arrays.sort(arr);
        System.out.print("Assending : ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.print("Dessnding : ");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Main2(){
        int[] arr={12,4,7,23,22,18,9,33,10};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Assending :"+Arrays.toString(arr));
    }
}

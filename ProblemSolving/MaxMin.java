package ProblemSolving;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {12, 43, 16, 24, 33, 19, 55, 11, 33, 26};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            if(max<arr[i]){
                max=arr[i];
            } else if (min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println("Max Number Is : " + max);
        System.out.println("Min Number Is : " + min );

    }
}

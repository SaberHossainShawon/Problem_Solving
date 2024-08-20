package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your two number :");
        int a=input.nextInt();
        int b=input.nextInt();
       // Main(a,b);
        Main2(a,b);
    }

    public static void Main(int a,int b){
        int[] arr={a,b};

        for (int i = 0; i <arr.length-1 ; i++) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static  void Main2(int a, int b){
        System.out.println("Before Swap :" +a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap :" +a+" "+b);
    }
}

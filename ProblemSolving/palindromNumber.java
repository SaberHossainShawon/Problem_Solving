package ProblemSolving;

import java.util.Scanner;

public class palindromNumber {
    public static String Main(){
        int num,temp,sum;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Number=");
        num=input.nextInt();
        temp=num;
        sum=0;

        while(temp != 0){
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if (num==sum){
            return "Palindrom";
        }else {
            return "Not Palindrom";
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Main());
    }
    
}

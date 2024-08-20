package ProblemSolving;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void Main(){
        int num,sum=0,temp,r;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number=");
        num=input.nextInt();
        temp=num;
        while(temp != 0){
            r=temp%10;
            System.out.println(r);
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(num==sum){
            System.out.print("Armstrong");
        }else{
            System.out.print("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Main();
    }
}

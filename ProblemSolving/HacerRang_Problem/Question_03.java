package ProblemSolving.HacerRang_Problem;
//--------Java If-Else--------------------------
import java.util.Scanner;
public class Question_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int a=input.nextInt();
        if(a%2 != 0){
            System.out.println("Weird");
        }else if(a>=2 && a<=5){
            System.out.println("Not Weird");
        }else if(a>=6 && a<=20){
            System.out.println("Weird");
        }else{
            System.out.println("Weird");
        }

    }
}

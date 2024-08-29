package ProblemSolving.HacerRang_Problem;

import java.util.Scanner;

//--------Java Substring Comparisons
public class Question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String s = input.nextLine();

        System.out.println("Enter your number :");
        int k = input.nextInt();

        String smallest = s.substring(0, k);
        String biggest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);
            //System.out.println(subString);

            if (subString.compareTo(smallest) < 0) {
                 smallest=subString;
            }

            if(subString.compareTo(biggest)>0){
                biggest=subString;
            }
        }
        System.out.println("Smallest SubString Is : "+smallest);
        System.out.println("Biggest SubString Is : "+biggest);
    }
}

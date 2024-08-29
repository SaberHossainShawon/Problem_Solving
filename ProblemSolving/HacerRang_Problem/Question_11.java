package ProblemSolving.HacerRang_Problem;

//-----------java Date and Time----------------

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your date,month and year with speech :");
        int date=input.nextInt();
        int month=input.nextInt();
        int year=input.nextInt();
        LocalDate Day=LocalDate.of(year,month,date);
        String s=Day.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
        System.out.println();
        System.out.println(s);
    }
}
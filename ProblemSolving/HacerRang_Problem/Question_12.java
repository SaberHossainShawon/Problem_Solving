package ProblemSolving.HacerRang_Problem;

//-----------Currency formatter----------------------

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your Currency : ");
        double payment=input.nextDouble();


        //---------Us Format------------------
        NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
        String us=usFormat.format(payment);

        //--------------------India format----------------------
        NumberFormat inFormat=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india=inFormat.format(payment);

        //--------------------China format----------------------
        NumberFormat cnFormat=NumberFormat.getCurrencyInstance( Locale.CHINA);
        String china=cnFormat.format(payment);

        //--------------------China format----------------------
        NumberFormat frFormat=NumberFormat.getCurrencyInstance( Locale.FRANCE);
        String france=frFormat.format(payment);


        System.out.println("US : "+ us);
        System.out.println("INDIA : "+ india);
        System.out.println("CHINA : "+ china);
        System.out.println("FRANCE : "+ france);


    }
}

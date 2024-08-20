package ProblemSolving.series;

public class series04 {
    public static void main(String[] args) {
        double a=1d;
        double b=2d;
        int sum=0;
        for (int i = 1; i <=5 ; i++) {
            int c= (int) Math.pow(a,b);
            System.out.println(c);
            a++;
            sum=sum+c;
        }
        System.out.println("Sum is " + sum);
    }
}

package ProblemSolving.pattren;

public class pattren02 {
    public static void main(String[] args) {
        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                if (col%2==0){
                    System.out.print(col%2+" ");
                }else {
                    System.out.print(col+" ");
                }

            }
            System.out.println();
        }
    }
}

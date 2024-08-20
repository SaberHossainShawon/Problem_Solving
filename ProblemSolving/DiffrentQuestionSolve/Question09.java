package ProblemSolving.DiffrentQuestionSolve;

//Find out the ten unique Random numbers.---------------.

public class Question09 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            int num=(int)(Math.random()*100+1);
            System.out.println(num);
        }

    }
}

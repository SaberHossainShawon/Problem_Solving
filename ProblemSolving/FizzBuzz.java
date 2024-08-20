package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
           //Main();
           Main2();
    }

    public static void Main(){
        List<String> arr=new ArrayList<>();

        for (int i = 1; i <=15 ; i++) {
            if(i%3==0 && i%5==0){
                arr.add("FizzBuzz");
            } else if (i%3==0) {
                arr.add("Fizz");
            } else if (i%5==0) {
                arr.add("Buzz");
            }else {
                arr.add(Integer.toString(i));
            }
        }
        System.out.println(arr);
    }

    public static void Main2(){
        List<String> list=new ArrayList<>();
        for (int i = 1; i <=15 ; i++) {
            list.add(i%3==0 && i%5==0? "FizzBuzz" : i%3==0 ?
                    "Fizz":i%5==0?"Buzz":Integer.toString(i)
                    );
        }

        System.out.println(list);
    }
}

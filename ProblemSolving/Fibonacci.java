package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int num=1;
        List<Integer> array=new ArrayList<>();
        array.add(0);
        for (int i = 0; i <10 ; i++) {
            array.add(num);
            num=num+array.get(i);
        }
        System.out.println(array);
    }
}

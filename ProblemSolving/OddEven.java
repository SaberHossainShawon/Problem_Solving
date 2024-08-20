package ProblemSolving;

public class OddEven {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your Number :");
//        int a=input.nextInt();
//        if(a%2==0){
//            System.out.println("This is Even number");
//        }else {
//            System.out.println("this is Odd prime");
//        }
        Main();
    }

    public static void Main(){
        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                System.out.println(i+ " Even Number");
            }else {
                System.out.println(i +" Odd Prime ");
            }
        }
    }
}

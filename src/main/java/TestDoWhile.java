import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum=0;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("enter an integer");
            data= input.nextInt();
            sum+=data;
        }
        while (data!=0);
        System.out.println("the sum is" + sum);

    }
}

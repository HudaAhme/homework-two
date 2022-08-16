import java.util.Scanner;

/**
 * Created by DELL on 14/08/2022.
 */
public class fourthpow {
    public static void main(String[] args) {
        int num,square,cube;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number ");
        num=input.nextInt();
        square=num*num;
        cube=num*num*num;
       double fourth=Math.pow(num,4);
        System.out.println("the square is  "+square);
        System.out.println("the cube is    "+cube);
        System.out.println("the fourth is    "+fourth);
    }
}

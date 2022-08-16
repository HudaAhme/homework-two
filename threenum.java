import java.util.Scanner;

/**
 * Created by DELL on 14/08/2022.
 */
public class threenum {
    public static void main(String[] args) {
        int num1,num2,num3,avg;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        num1=input.nextInt();

        System.out.println("enter seconed number");
        num2=input.nextInt();

        System.out.println("enter thired number");
        num3=input.nextInt();
        avg=(num1+num2+num3)/3;
        System.out.println("the avreage is "+avg);


    }
}

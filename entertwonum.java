import java.util.Scanner;

/**
 * Created by DELL on 14/08/2022.
 */
public class entertwonum {
    public static void main(String[] args) {
        int num1,num2,sum,diffrence,product,avg,disance,maxmum,minmum;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        num1=input.nextInt();
        System.out.println("enter seconed number");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.println("the summition is  "+sum);
        diffrence=num1-num2;
        System.out.println("the diffrence is  "+diffrence);
        product=num1*num2;
        System.out.println("the product is  "+product);
        avg=(num1+num2)/2;
        System.out.println("the avg is  "+avg);
        diffrence=Math.abs(diffrence);
        System.out.println("the diffrence is  "+diffrence);
        maxmum=Math.max(num1,num2);
        System.out.println("the maxmum is  "+maxmum);
        minmum=Math.min(num1,num2);
        System.out.println("the minmum is  "+minmum);
    }
}

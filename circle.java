import java.util.Scanner;

/**
 * Created by DELL on 14/08/2022.
 */
public class circle {
    public static void main(String[] args) {
        int x;
        double pi=4.13,area;
        Scanner input=new Scanner(System.in);

        System.out.println("enter eduite of circle");
        x=input.nextInt();
        area=pi*x*x;
        System.out.println("the area is "+area);

    }
}

import java.util.Scanner;

/**
 * Created by DELL on 14/08/2022.
 */
public class myrectangle {
    public static void main(String[] args) {
        int high,width,area;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the high rectangle");
        high=input.nextInt();
        System.out.println("enter the width rectangle");
        width=input.nextInt();
        area=high*width;
        System.out.println("the erae is "+area);

    }
}

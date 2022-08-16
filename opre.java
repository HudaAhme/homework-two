/**
 * Created by DELL on 16/08/2022.
 */
public class opre {
    public static void main(String[] args) {
        int number1=20,number2=25,sum,diffrenc,product,disance,maxmum,minmum;
        float avg;
        sum=number1+number2;
        System.out.println("sum:   "+sum);
        diffrenc=number1-number2;
        System.out.println("diffrence:  "+diffrenc);
        product=number1*number2;
        System.out.println("product:   "+product);
        avg=(number1+number2)/2;
        System.out.println("avg:   "+avg);
        disance=number1%number2;
        System.out.println("disance:   "+disance);
        maxmum=Math.max(number1,number2);
        System.out.println("maxmum: "+maxmum);
        minmum=Math.min(number1,number2);
        System.out.println("minmum: "+minmum);

    }
}

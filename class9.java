import java.util.Scanner;
public class class9 {
    public static void main(String[]args){
        Scanner sc = new
        Scanner( System.in);
        double radius ,area;
         System.out.print( "Enter radius");
        radius = sc.nextDouble();
        area = 3.1416 * radius * radius;
        System.out.print("Area = " + area);
    }
}
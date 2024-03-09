package practices;

import java.util.Scanner;

public class c3 {
    public static double equation(double a,double b,double c){
        double result=Math.pow(a, 3)+b*Math.pow(a, 2)+2*b*Math.pow(a, 2)+2*a*Math.pow(b, 2)+a*Math.pow(b, 2)+Math.pow(b, 3);
        return result;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a : ");
        double a=obj.nextDouble();
        System.out.print("Enter b : ");
        double b=obj.nextDouble();
        System.out.print("Enter c : ");
        double c=obj.nextDouble();
        System.out.println(equation(a, b, c));
    }
    
}

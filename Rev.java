import java.util.Scanner;
public class Rev {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        System.out.println(rev);
        int a=3;
        int b=3;
        double s=Math.pow(2,3);
        System.out.println(s);

        
    }
    
}

import java.util.Scanner;
public class Binary_to_Decimal {
    public static void main(String[] args) {
       
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        int dec=0;
        while(num>0){
        int rem=num%10;
        dec=dec+(int)rem*(int)Math.pow(2, count);
        count++;
        num=num/10;

    }
    System.out.println(dec);
}

    
}

import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int gcd=0;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
    
}

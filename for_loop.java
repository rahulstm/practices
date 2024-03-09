import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number ");
        int n=obj.nextInt();
        int sum=0;
        for(int i=1;i<=n && sum<1000;i++){
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
    
}

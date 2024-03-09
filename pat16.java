import java.util.Scanner;
public class pat16 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;

            }
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
             System.out.println();
            i++;
        }
       
    }
    
}

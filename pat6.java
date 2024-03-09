// 1
// 21
// 321
// 4321
// 54321




import java.util.Scanner;
public class pat6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i-j+1+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}

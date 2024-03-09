// 1
// 22
// 333
// 4444


import java.util.Scanner;
public class pat5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;

            }
            System.out.println();
            i++;
        }
        
    }
    
}

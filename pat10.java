// G
// GF
// GFE
// GFED
// GFEDC
// GFEDCB
// GFEDCBA
import java.util.Scanner;
public class pat10 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt();
        int i,j;
        i=row;
        while(i>=1){
             j=row;

            while(j>=i){
                char ch=(char)(j +64);
                System.out.print(ch);
                j--;
            }
             i--;
            System.out.println();
           
        }
    }
    
}

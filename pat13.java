// 1
// 21
// 321
// 4321
import java.util.Scanner;
public class pat13 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(n>=i){
            int j=1;
            while(i>=j){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

    }
    
}

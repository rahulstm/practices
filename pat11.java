import java.util.Scanner;

public class pat11 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int Starting_number=i;
            while(j<=i){
                System.out.print(Starting_number);
                Starting_number++;
                j++;
            }

            System.out.println();
            i++;
        }
        
    }
    
}

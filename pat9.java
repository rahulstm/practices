import java.util.Scanner;
public class pat9 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
           
            while(j<=i){
                 char ch=(char)('A' +i+j-2);
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
        }

        
    }
    
}

import java.util.Scanner;
public class Break_Keyword {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
                if(j>i){
                    break;
                }

            }
            System.out.println();
            i++;
        }
    }
    
}

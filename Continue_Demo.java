import java.util.Scanner;

//import LEC_2.while_loop.ps;
public class Continue_Demo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        // int i=0;
        // while(i<=10){
        //     if(i==5){
        //         i++;
        //         continue;
        //     }
        //     System.out.print(i+" ");
        //     i++;
        // }
        for(int i=0;i<=n;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
    }
    
}

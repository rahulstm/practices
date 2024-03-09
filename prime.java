import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;

            }
            
        }
        if(count==2){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }

    }
    
}

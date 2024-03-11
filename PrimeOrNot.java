import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("This Number is prime = "+n);
        }
        else{
            System.out.println("This is not prime = "+n);
        }
    }
    
}

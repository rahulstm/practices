import java.util.Scanner;
public class sumorproduct {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int choice=obj.nextInt();
        int num=obj.nextInt();
        int prod=1;
        int sum=0;
        if(choice==1){
            for(int i=1;i<=num;i++){
            
                sum=sum+i;
                

        }
        
        System.out.println(sum);
        
        
    }
     
    
        
         if(choice==2){
         for(int i=1;i<=num;i++){
       
            prod=prod*i;
        }
        System.out.println(prod);

    }
        
        else{
            System.out.println("-1");
            
        }
    }
    }
    


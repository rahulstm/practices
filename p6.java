public class p6 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if(a++>10&&++b>20){
            System.out.println("Inside if");
        }
        // System.out.println(a);
        // System.out.println(b);
        else{
            System.out.println("inside else");
        }
        System.out.println(a+" "+b);
    }
    
}

package practices;

public class sumofevenodd {
    public static void main(String[] args) {
        int num=1234;
        String s=String.valueOf(num);
        String sum="";
        String t="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sum=sum+s.charAt(i);
            }
            else{
                t=t+s.charAt(i);

            }
        }
        System.out.println(sum);
        System.out.println(t);

    }
    
}

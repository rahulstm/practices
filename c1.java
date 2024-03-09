package practices;
// Write a function that accepts a string with some “#” in it. 
// Move all the hashes to the front of the string and return the modified string.
import java.util.Scanner;

public class c1 {
    public static String inpuString(String str){
        String st="";
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                st+=str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='#'){
                s+=str.charAt(i);
            }
        }
        return st+s;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter String :" );
        String str=obj.nextLine();
        System.out.println(inpuString(str));
        
    }
    
}

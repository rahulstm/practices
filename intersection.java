package practices;

public class intersection {
    public static void main(String[] args) {
        int []arr1={1,3,4,5,2,7};
        int []arr2={4,5,6};
        //int []temp=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    
                }
            }

        }
       
    }
    
}

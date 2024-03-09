import LEC_2.while_loop.ps;

public class binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
       int low=0;
       int target=1;
       int high=arr[arr.length-1];
       //int mid=(low+high)/2;
       while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.println("Target is at "+mid+" position");
            break;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        
       }

       if(low>high){
        System.out.println("Element not found ");
       }
       
      
      }

       }

       //System.out.println(last);
    
    


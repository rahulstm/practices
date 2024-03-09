import java.util.Scanner;
public class Two_sum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{}; 
    }  
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int target=obj.nextInt();
            int size=obj.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=obj.nextInt();
            }
            
            twoSum(arr,target);
            System.out.println(twoSum(arr, target));

        
        }      
        
    }

    


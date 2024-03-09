class p3{
    public static void main(String[] args) {
        p3 obj = new p3();
        int []res = obj.find();
        System.out.print("i = "+res[0]+" j = "+res[1]);
    }
    public static int[] find() {
        int arr[]={1,2,3,4,5,6};
        int target=5;
        int [] temp = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    
                    temp[0] = i;temp[1] = j;
                    break;
                }
            }
        }
        return temp;
    }
}
public class productExceptSelf {
     int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int [] left=new int [nums.length];
        int [] right =new int [nums.length];
        int i=0;
        while (i<nums.length){
            if(i==0){
                left[i]=1;
                i++;
            }
            else{
            left[i]=left[i-1]*nums[i-1];
            i++;
            }
        }
        int j=nums.length-1;
        while (j>=0){
            if(j==nums.length-1){
                right[j]=1;
                j--;
            }
            else{
            right[j]=right[j+1]*nums[j+1];
            j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=left[k]*right[k];   
        }
     return arr;   
    }
    public static void main(String [] args){
        int [] nums={1,2,3,4};
        productExceptSelf obj=new productExceptSelf();
        int[] head=obj.productExceptSelf(nums);
        for(int i=0;i<4;i++){
            System.out.print(head[i]+" ");
        }
    }
}

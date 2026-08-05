package Arrays_and_hashing;
public class duplicatelements217{
    static void merge(int nums[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int temp[]=new int[high-low+1];
        int k=0; 
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }
            else{
                temp[k++]=nums[right++];
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
            temp[k++]=(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp[i-low];
        }
    }
    static void mergsort(int nums[],int low,int high){
        if (low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergsort(nums,low,mid);
        mergsort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    boolean containsDuplicate(int[] nums){
        if(nums.length==1){
            return false;
        }
        mergsort(nums, 0, nums.length-1);
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                if(nums[i]==nums[i-1]){
                return true;
            }
            }
            else if(i==0){
                int p=i+1;
                if(nums[i]==nums[p]){
                    return true;
                }
            }
            else{
            int p=i+1;
            if(nums[i]==nums[p]){
                return true;
            }
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
    }
        return false;
    }
    public static void main(String[] args) {
        duplicatelements217 obj=new duplicatelements217();
        int nums[]={1,5,-2,-4,0};
        boolean ok=obj.containsDuplicate(nums);
        System.out.println(ok);
    }
}
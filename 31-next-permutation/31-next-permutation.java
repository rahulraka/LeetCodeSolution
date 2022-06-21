class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                ind1= i-1;
                break;
            }
        }
        if(ind1!=-1){
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[ind1]){
                ind2=i;
                break;
            }
        }
        swap(ind1,ind2, nums);
        reverse(ind1+1, nums.length-1, nums);
        
        // System.out.print(nums.toString());
        }
        else reverse(0, nums.length-1, nums);
        
    }
    public void reverse(int i, int j, int[] arr){
        while(i<j){
            swap(i, j, arr);
        i++;
        j--;
        }
    }
    public void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
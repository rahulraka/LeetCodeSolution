class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        return result(nums.length, nums);
        
}
    public static int[] result(int n,int[] arr){
       if(arr.length==1){
           int[] ans=new int[1];
           ans[0]=arr[0];
           return ans;
       } 
       int[] left=new int[n];
       int[] right=new int[n];
       int[] ans=new int[n];
       int lPro=1;
       int rPro=1;
       for(int i=0;i<n;i++){
           lPro*=arr[i];
           left[i]=lPro;
       }
       for(int i=n-1;i>=0;i--){
           rPro*=arr[i];
           right[i]=rPro;
       }
       ans[0]=right[1];
       ans[n-1]=left[n-2];
       for(int i=1;i<=n-2;i++){
           ans[i]=left[i-1]*right[i+1];
       }
       
       
       return ans;
   }
}
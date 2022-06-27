class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0,k=0;
        int[] ans=new int[n+m];
        while(i<m && j<n){
           if(nums1[i]<nums2[j]){
               ans[k++]=nums1[i++];
           }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
             ans[k++]=nums2[j++];
        }
        for(int z=0;z<m+n;z++){
            nums1[z]=ans[z];
        }
        
        
    }
}
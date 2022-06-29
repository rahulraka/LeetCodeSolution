class Solution {
    public int largestRectangleArea(int[] heights) {
        return result(heights.length, heights);
    }
    public int result(int n, int[] arr){
     Stack<Integer> left = new Stack<Integer>();
     int[] lans=new int[n];
     for(int i=0;i<n;i++){
         while(!left.isEmpty() && arr[i]<=arr[left.peek()]) left.pop();
         if(left.isEmpty()) lans[i]=-1;
         else lans[i]=left.peek();
         left.push(i);
     }
     
     Stack<Integer> right = new Stack<Integer>();
     int[] rans=new int[n];
     for(int i=n-1;i>=0;i--){
         while(!right.isEmpty() && arr[i]<=arr[right.peek()]) right.pop();
         if(right.isEmpty()) rans[i]=n;
         else rans[i]=right.peek();
         right.push(i);
     }
     
     int max=0;
     for(int i=0;i<n;i++){
         int tem=rans[i]-lans[i]-1;
         int temp=arr[i]*tem;
        max= Math.max(max,temp);
     }
     return max;
     
 } 
}
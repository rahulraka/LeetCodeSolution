/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let n=height.length
    let arr=height
    if(n<3) return 0;
    let lef=left(arr,n)
   let righ=right(arr,n)
   let sum=0
   for(let i=0;i<n;i++){
       sum+= Math.min(lef[i],righ[i])-arr[i]
   }
    return sum
};
 function left(arr, n){
      let ans=[]
      ans[0]=arr[0]
      for(let i=1;i<n;i++){
          ans[i]=Math.max(arr[i],ans[i-1])
      }
      return ans
      
  }
  function right(arr, n){
      let ans=[]
      ans[n-1]=arr[n-1]
      for(let i=n-2;i>=0;i--){
          ans[i]=Math.max(arr[i],ans[i+1])
      }
      return ans
      
  }
  
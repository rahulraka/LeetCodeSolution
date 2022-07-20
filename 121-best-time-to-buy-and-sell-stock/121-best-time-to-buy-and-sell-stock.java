class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        // Arrays.sort(prices);
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min=prices[i];
            }
            int p=prices[i]-min;
            max=Math.max(p,max);
        }
        return max;
        
//         for(int i = 0; i < prices.length; i++){
//             if(prices[i] < lsf){
//                 lsf = prices[i];
//             }
//             pist = prices[i] - lsf;
//             if(op < pist){
//                 op = pist;
//             }
//         }
//         return op;
        
    }
}
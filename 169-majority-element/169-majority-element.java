class Solution {
   public static int majorityElement(int[] nums) {
	        Map<Integer, Integer> hm=new HashMap();
	        for(int i=0;i<nums.length;i++){
	            if(hm.containsKey(nums[i])){
	                int val=hm.get(nums[i]);
	                hm.put(nums[i], val+1);
	            }
	            else {
	            	hm.put(nums[i], 1);  
	            }
	        }
	        int res=0;
	        int max=0;
	        for(Map.Entry<Integer, Integer> ind: hm.entrySet()) {
	        	 if(ind.getValue()>max) {
	        		 max=ind.getValue();
	        		 res=ind.getKey();
	        	 }
	        }
	        return res;
	        
	      
	    }
}
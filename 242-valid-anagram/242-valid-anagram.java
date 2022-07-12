class Solution {
    public boolean isAnagram(String s, String t) {
        return checkAnagram(s,t);
    }
    
    public static boolean checkAnagram(String a, String b) {
        if(a.length()!=b.length()) return false;
		Map<Character, Integer> m1=new HashMap();
		
		for(int i=0;i<a.length();i++) {
			char x=a.charAt(i);
			
				
				if(m1.containsKey(x)) {
					int c=m1.get(x);
					m1.put(x, c+1);
				} 
				else {
					m1.put(x, 1);
				}
				
				
			
		}
		
		
		for(int i=0;i<b.length();i++) {
			char x=b.charAt(i);
			
				
				if(m1.containsKey(x)) {
					int c=m1.get(x);
					m1.put(x, c-1);
				} 
			
		}
		
		boolean flag=true;
		
		for ( Map.Entry<Character, Integer> entry : m1.entrySet()) {
		    int tab = entry.getValue();
		    if(tab>0) flag=false;
		    // do something with key and/or tab
		}
		return flag;
		
	}
}
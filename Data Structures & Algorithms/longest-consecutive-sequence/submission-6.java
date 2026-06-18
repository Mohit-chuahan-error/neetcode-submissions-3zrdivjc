class Solution {
    	private static int longestConsecutive(int[] nums) {
		
        if(nums==null || nums.length==0) {
			return 0;
		}
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i:nums ) {
			ts.add(i);
		}
		
		int maxlength=1;
		int currlength=1;
		ArrayList<Integer> Ar=new ArrayList<>(ts);
		for(int i=0;i<Ar.size()-1;i++) {
			if(Ar.get(i)==Ar.get(i+1)-1) {
				currlength++;
				
			}
			else {
				maxlength=Math.max(currlength, maxlength);
				currlength=1;
			}
		}
		
		
		 return Math.max(currlength, maxlength);
	}
}

class Solution {
    public int maxArea(int[] heights) {
          int amount=0;
	        int currentAmount=0;
	        int maxamount=0;
	        for(int i=0;i<heights.length;i++){
	            for(int j=i+1;j<heights.length;j++){
	                int min=Math.min(heights[i],heights[j]);
	                int len=0;
	                len=j-i;
	                currentAmount=min*(len);
	                maxamount=Math.max(maxamount,currentAmount);
	            }
	  
	            amount=Math.max(amount,maxamount);
	        }
	        return amount;
	    }
}

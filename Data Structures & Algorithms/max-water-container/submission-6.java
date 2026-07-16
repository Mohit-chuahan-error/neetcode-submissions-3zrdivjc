class Solution {
    public int maxArea(int[] heights) {
        int maxAmount=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
        int currentHeight=Math.min(heights[left],heights[right]);
        int width=right-left;
        int currentWater=currentHeight*width;
        maxAmount=Math.max(maxAmount,currentWater);
        if(heights[left]>heights[right]){
            right--;
        }
        else{
            left++;
        }
        }
        return maxAmount;
    }
}

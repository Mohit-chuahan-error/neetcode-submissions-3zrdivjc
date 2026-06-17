class Solution {
    public int majorityElement(int[] nums) {
        int majoritynum=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(majoritynum==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
               majoritynum=nums[i]; 
               count=1;
            }
        }
        return majoritynum;
    }
}
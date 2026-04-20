class Solution {
    public int majorityElement(int[] nums) {
        int counter=1;
    int max=nums[0];
    for(int i=1;i<nums.length;i++){
            if(nums[i]==max){
                counter++;
                max=nums[i];
            }
            else{
                counter--;
                if(!(counter>0)){
                max=nums[i];
            }
            }
    }
            return max;
    }
}
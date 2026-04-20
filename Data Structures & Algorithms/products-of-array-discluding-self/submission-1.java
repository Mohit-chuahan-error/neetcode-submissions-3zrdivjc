class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] multiarray=new int[nums.length];   
        for(int i=0;i<nums.length;i++){
               int max=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    max=max*nums[j];
                }
            }
            multiarray[i]=max;
        }
        return multiarray;
    }
}  

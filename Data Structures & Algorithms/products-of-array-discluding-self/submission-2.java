class Solution {
    public int[] productExceptSelf(int[] nums) {
         int[] multiarray=new int[nums.length]; 
        int multi=1;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
             zero++;   
            }else{
            multi=multi*nums[i];
            }
        }
        for(int j=0;j<nums.length;j++){
           if(zero>1){
            multiarray[j]=0;
           }
           else if(zero==1 ){
             if(nums[j]==0){
                multiarray[j]=multi;
             }
             else{multiarray[j]=0;
             }
           }else{
             multiarray[j] = multi / nums[j];
           }


    }
    return multiarray;
}  
}

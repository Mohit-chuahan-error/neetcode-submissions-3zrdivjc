class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> Ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){
                Ar.add(nums[i]);
            }
        }
        for(int i=0; i<Ar.size(); i++){
            nums[i] = Ar.get(i);
        }
        return Ar.size();
    }
}
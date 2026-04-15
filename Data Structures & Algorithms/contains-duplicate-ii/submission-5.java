class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer,Integer> map =new HashMap<>();
    int minlength=0;
    for(int i=0;i<nums.length;i++) {
        if(!map.containsKey(nums[i])) {
            map.put(nums[i],i);
        } else {
            int index= map.get(nums[i]);
            if(Math.abs(index - i) <= k) {
                return true;
            } else {
                // map.remove(nums[i]);
                map.put(nums[i],i);
            }

        }
    }
    return false;
    }
}
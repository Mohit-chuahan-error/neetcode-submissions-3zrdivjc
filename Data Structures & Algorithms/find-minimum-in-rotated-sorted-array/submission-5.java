class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than the right element,
            // the inflection point (minimum) must be to the right of mid.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // If mid element is less than or equal to the right element,
            // the mid element itself could be the minimum, or it's to the left.
            else {
                right = mid;
            }
        }
        return nums[left];
    }
}

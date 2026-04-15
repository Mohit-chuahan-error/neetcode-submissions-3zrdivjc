class Solution {
    public boolean isPalindrome(String s) {
        String sorted=s.toLowerCase().replaceAll("[^a-z0-9A-Z]","");

        int left=0;
        int right=sorted.length()-1;

        while(left<right){
            if(sorted.charAt(left)!=sorted.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

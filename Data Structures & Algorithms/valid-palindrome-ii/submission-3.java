class Solution {
    public boolean validPalindrome(String s) {  int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // When we hit the FIRST mismatch, we have two choices:
                // 1. Skip left character: isPal(left + 1, right)
                // 2. Skip right character: isPal(left, right - 1)
                return isPal(left + 1, right, s) || isPal(left, right - 1, s);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPal(int l, int r, String s) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }


}
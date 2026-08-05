class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int maxlength=0;
        if(s.length()==1){
            return 1;
        }
        
        Set<Character> hs=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(hs.contains(s.charAt(right))){
                 int currentlength=right-left;;
                maxlength=Math.max(maxlength,currentlength);
                 hs.remove(s.charAt(left));
                left++;   
            }   
            hs.add(s.charAt(right));
          int currentlength=right-left+1;
                maxlength=Math.max(maxlength,currentlength);
        }
    return maxlength;
    }
}

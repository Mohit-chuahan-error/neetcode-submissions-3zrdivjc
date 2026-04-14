class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count=0;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];    
                
        while(count<first.length() && count<last.length()){
            if(first.charAt(count)==last.charAt(count)){
                count++;
            }else{
                break;
            }
        }
       return first.substring(0,count);
    }
}
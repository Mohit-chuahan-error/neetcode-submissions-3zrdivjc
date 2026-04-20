class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left=0;
        int right=0;
        StringBuilder sb=new StringBuilder();
         int len=word1.length()+word2.length();
       
    while(len>0  ){
        if(left<word1.length()){
        sb.append(word1.charAt(left));
            left++;
        }
        if(right<word2.length()){
        sb.append(word2.charAt(right));
        right++;
        }
        len--;
    }
    return sb.toString();
    




    }
}
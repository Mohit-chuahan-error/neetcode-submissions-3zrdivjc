class Solution {
    public String longestPalindrome(String s) {
        
        int maxlength=0;
        String result="";
        if(s.isEmpty() && s.length()==0){
            return "";
        }
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String newString=s.substring(i,j+1);
                Boolean ispalindrome=isPalindrome(newString);
                if(ispalindrome){
                    if(maxlength<newString.length()){
                        result=newString;
                        System.out.println("Result "+result);
                    }
                    int currentLength=newString.length();
                    maxlength=Math.max(maxlength,currentLength);            
                }
            }
        }
        return result;
    }
        public  static boolean isPalindrome(String s){
            int left=0;
            int right=s.length()-1;
            while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                right--;
                left++;
            }
            }
        
            return true;
        }
    
}

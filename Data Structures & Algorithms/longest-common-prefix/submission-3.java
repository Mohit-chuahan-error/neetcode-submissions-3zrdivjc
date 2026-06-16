class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String subString=subString(strs[0],strs[strs.length-1]);
        System.out.println("sveb "+subString);
        return subString;
    }

    public static String subString(String s1,String s2){
        int minlength=Math.min(s1.length(),s2.length());
        System.out.println(s1+" "+s2);
        for(int i=0;i<minlength;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0,i);
            }
        }
        return s1.substring(0,minlength);
    }
}
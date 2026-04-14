class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sc=s.toLowerCase().toCharArray();
        char[] st=t.toLowerCase().toCharArray();
        Arrays.sort(sc);
        Arrays.sort(st);
        if(Arrays.equals(sc,st)){
            return true;
        }
        return false;

    }
}

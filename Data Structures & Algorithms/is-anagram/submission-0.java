class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] cs=s.toCharArray();
        Arrays.sort(cs);
        char[] ct=t.toCharArray();
        Arrays.sort(ct);
        String sorteds=new String(cs);
        String sortedt=new String(ct);

        if(sorteds.equals(sortedt)){
            return true;
        }
        return false;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> hs=new ArrayList<>();
         boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
             if (visited[i]) {
                continue;
            }
            ArrayList<String> intHm=new ArrayList<>();
            String s1=strs[i];
            intHm.add(s1);
             visited[i] = true;
            for(int j=i+1;j<strs.length;j++){
                 if (visited[j]) {
                continue;
            }
            String s2=strs[j];
            if(checkAnagrams(s1,s2)){
                intHm.add(s2);
                 visited[j] = true;
            }
        }
        hs.add(intHm);
        }
        return hs;
    }

    public boolean checkAnagrams(String s1,String s2){
            if(s1.length()!=s2.length()){
                return false;
            }
            int[] arr=new int[26];
            for(int i=0;i<s1.length();i++){
                arr[s1.charAt(i)-'a']++;
                arr[s2.charAt(i)-'a']--;
            }
            for(Integer i:arr){
                if(i!=0){
                    return false;
                }
            }
            return true;
    } 
}

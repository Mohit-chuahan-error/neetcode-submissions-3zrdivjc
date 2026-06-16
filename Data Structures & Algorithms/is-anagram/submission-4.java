class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
           return false; 
        }
    Map<Character,Integer> hm=new HashMap<>();
      Map<Character,Integer> hmt=new HashMap<>();
    for(Character c:s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1); 
    }
     for(Character c:t.toCharArray()){
        hmt.put(c,hmt.getOrDefault(c,0)+1); 
    }
    
    return hm.equals(hmt);
}
}

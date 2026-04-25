class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int right=k;
    int len=nums.length;

    ArrayList<Integer> Ar=new ArrayList<Integer>();
     ArrayList<Integer> Ar2=new ArrayList<Integer>();
    for(int i=0;i<k;i++){
             Ar.add(nums[i]);   
            }
        while(right<len){
            int max=Collections.max(Ar);
            Ar2.add(max);
            Ar.remove(0);
             Ar.add(nums[right]);
             right++;
        }
        Ar2.add(Collections.max(Ar));
       return Ar2.stream().mapToInt(i -> i).toArray();
    }
}

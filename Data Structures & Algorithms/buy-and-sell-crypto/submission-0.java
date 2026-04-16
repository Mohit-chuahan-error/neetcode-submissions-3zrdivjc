class Solution {
    public int maxProfit(int[] prices) {
        
        HashSet<Integer> hs=new HashSet<>();
        int maxprofit=0;
        int currentprofit=0;
         int left =0,right=0;
    while(right<prices.length){

         currentprofit=prices[right]-prices[left];
        maxprofit =Math.max(maxprofit,currentprofit);

    if(prices[right]<prices[left]){
        left=right;
    }
    right++;
    }
    return maxprofit;
    }   
}

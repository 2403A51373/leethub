class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int a [] = new int [n];
        for(int i = 0 ; i < n ; i++){
            a[i] = prices[i];
            for(int j  = i+1 ; j < n ; j++){
                if(prices[j] <= prices[i] ){
                    a[i] = prices[i] - prices[j] ;
                    break;
                }
            }
        }
        return a;
    }
}
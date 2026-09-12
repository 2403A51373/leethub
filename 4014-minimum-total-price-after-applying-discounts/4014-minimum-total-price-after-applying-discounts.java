class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        /*
        int mp = 0;
        int md = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if( mp < prices[i]){ mp = prices[i]; }
        }
        for(int i = 0 ; i < discounts.length ; i++){
            if( md < discounts[i]){ md = discounts[i]; }
        }
        */
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double s = 0;
        int i = prices.length - 1;
        int j = discounts.length - 1;
        while(i >= 0  && j >=0){
            s = s + (double)( prices[i] * (100 - discounts[j])) / 100;
            i--;
            j--;
        }
        while(i >= 0){
            s = s + prices[i];
            i--;
        }
        return s;
    }
}
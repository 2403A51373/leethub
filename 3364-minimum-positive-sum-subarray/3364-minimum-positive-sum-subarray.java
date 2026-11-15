class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {    sum += nums.get(k);    }
                int len = j - i + 1;
                if (len >= l && len <= r && sum > 0) {    min = Math.min(min, sum);    }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
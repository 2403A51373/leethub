class Solution {
    public int[] sortedSquares(int[] a) {
        /*
        for(int i = 0; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
        */
        int i = 0;
        int j = a.length-1;
        int b [] = new int[a.length];
        int k = b.length-1;
        while(i<=j){
            int x = a[i] * a[i];
            int y = a[j] * a[j];
            if(x > y && k >=0){
                b[k] = x;
                i++;
            }
            else if(y >= x && k>=0){
                b[k] = y;
                j--;
            }
            k--;
        }
        return b;
    }
}
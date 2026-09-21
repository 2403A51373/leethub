class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int  j = 0;
        while(j<arr.length){
            if(arr[j]%2 == 0){
               int t=arr[i];
               arr[i] = arr[j];
               arr[j]=t;
               i++;
            }
            j++;
        }
        return arr;
    }
}
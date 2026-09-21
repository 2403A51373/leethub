class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int i = 0;
        int  j = 1;
        while(i < arr.length){
            if(i%2 == 0 && arr[i]%2==0){
                i = i + 2;
            }
            else if(j%2!=0 && arr[j]%2==1 ){
                j = j + 2;
            }
            else{
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        return arr;
    }
}
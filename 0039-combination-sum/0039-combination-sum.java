class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        find(0 , t , new ArrayList<>() , arr);
        return ans;
    }
    void find(int idx , int t , ArrayList<Integer> al , int[] arr){
        if(idx >= arr.length){return;}
        if(t < 0){return;}
        if(t==0){ ans.add(new ArrayList<>(al)); return;}
        al.add(arr[idx]);
        find(idx , t - arr[idx] , al , arr);
        al.remove(al.size()-1);
        find(idx+1 , t, al , arr);
    }
}
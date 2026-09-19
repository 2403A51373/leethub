class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> st = new ArrayList<>();
        int l = target.length;
        int i = 1;
        int j = 0;
        while(i <= n && j < l){
            if(i != target[j]){
                st.add("Push");
                st.add("Pop");
                i++;
            }
            else{
                st.add("Push");
                i++;
                j++;
            }
        }
        return st;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int [] s = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int i = arr.length-1;
        while(i >= 0){
            while(!st.isEmpty() && (arr[i] >= arr[st.peek()])){ 
                st.pop();
            }
            if(st.isEmpty()){   s[i] = 0; }
            else{
                s[i] = st.peek() - i;
            }
            st.push(i);
            i--;
        }
        return s;
    }
}
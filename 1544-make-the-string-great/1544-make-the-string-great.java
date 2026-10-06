class Solution {
    public String makeGood(String s) {
        //StringBuilder st = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty()){
                if(Math.abs(c - st.peek()) == 32){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
            else{
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c : st){
            ans.append(c);
        }
        return ans.toString();
    }
}
class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int m = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c++;
                m = Math.max(m, c);
            } 
            else if (s.charAt(i) == ')') {
                c--;
            }
        }

        return m;
        /*
        Stack<Character> st = new Stack<>();
        int c1 = 0 ; 
        int c2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){ 
                st.push(ch);
                c1++;
            }
            else if(ch == ')'){
                st.pop();
                c2 = Math.max(c1,c2);
                c1--;
            }

        }
        return c2;
        */
    }
}
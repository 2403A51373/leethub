class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {    st.pop();    } 
            else if (op.equals("D")) {    st.push(st.peek() * 2);    }
            else if (op.equals("+")) {
                int v1 = st.pop();
                int v2 = st.pop();
                st.push(v2);      
                st.push(v1);  
                st.push(v2+v1);
            }
            else {    st.push(Integer.parseInt(op));    }
        }
        
        int sum = 0;
        for (int s : st) {    sum += s;    }
        return sum;
    }
}

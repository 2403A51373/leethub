class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> gp = new ArrayList<>();
        find(n , n , gp , "");
        return gp;
    }
    void find(int o , int c , List<String> gp, String ans){
        if(o == 0 && c == 0){
            gp.add(ans);
            return;
        }
        if(o>0){
            find(o-1,c,gp,ans+"(");
        }
        if(c>o){
            find(o,c-1,gp,ans+")");
        }
    }
}
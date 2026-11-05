class Solution {
    boolean ans;
    void find(int i , int j , int idx , char mat [][], String t  ){
        if(idx >= t.length()){ ans = true; return;}
        if(i < 0 || j < 0 || i >= mat.length || j >= mat[0].length){    return;    }
        if(ans == true){ return;}
        if(mat[i][j] != t.charAt(idx)){return;}
        char temp = mat[i][j];
        mat[i][j] = '*';
        find(i+1 , j, idx+1 , mat , t);
        find(i-1 , j, idx+1 , mat , t);
        find(i , j+1, idx+1 , mat , t);
        find(i , j-1, idx+1 , mat , t);
        mat[i][j] = temp;
    }
    public boolean exist(char[][] mat, String t) {
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == t.charAt(0)){
                    find(i , j, 0 , mat , t);
                    if(ans){return true;}
                }
            }
        }
        return false;
    }
}
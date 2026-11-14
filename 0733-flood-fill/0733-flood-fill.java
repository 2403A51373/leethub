class Solution {
    public void find(int m [][] , int i , int j , int n , int color){
        if(i<0 || j < 0 || i >= m.length || j >= m[0].length){return;}
        if(m[i][j] != n || m[i][j] == color){ return;}
        m[i][j] = color;
        find(m,i+1,j,n,color);
        find(m,i,j+1,n,color);
        find(m,i-1,j,n,color);
        find(m,i,j-1,n,color);
    }
    public int[][] floodFill(int[][] m, int sr, int sc, int color) {
        int n = m[sr][sc];
        find(m , sr , sc , n , color);
        return m;
    }
}
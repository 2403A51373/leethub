class Solution {
    int area = 0;
    public void find(int m[][] , int i , int j){
        if(i<0 || j<0 || i>=m.length || j>=m[0].length){return;}
        if(m[i][j] == 0){return;}
        m[i][j] = 0;
        area++;
        find(m,i+1,j);
        find(m,i,j+1);
        find(m,i-1,j);
        find(m,i,j-1);
    }
    public int maxAreaOfIsland(int[][] m) {
        int ans = 0;
        for(int i = 0; i < m.length ; i++){
            for(int j = 0; j < m[0].length ; j++){
                find(m , i , j );
                ans = Math.max(area, ans);
                area  = 0;
            }
        }
        return ans;
    }
}
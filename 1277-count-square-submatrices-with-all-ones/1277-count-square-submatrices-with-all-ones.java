class Solution {
    /*
    public void find(int m[][] , int s , int c){
        if(s <=0){return;}
        int sum = 0;
        int result = s * s;
        int k = 0;
        while(k+s <= m.length){
            for(int i = 0 ; i < s ; i++){
                for(int j = 0 ; j < s ; j++){
                    sum = sum + m[i][j];
                }
            }
            if(sum == result){c++;}
            k++;
        }
        find(m, s-1 , c);
    }
    public int countSquares(int[][] m) {
        int s = Math.min(m[0].length , m.length);
        int c = 0;
        find(m, s , c);
        return c;
    }
    */
    public void find(int m[][] , int i , int j, int c){
        if(j > m[0].length || i > m.length){return;} 
        int d = m[i-1][j-1];
        int l = m[i][j-1];
        int t = m[i-1][j];
        int ch = Math.min(d , l);
        m[i][j] = m[i][j] + Math.min(ch , t);
        find(m,i,j+1,c);
        find(m , i+1 , j , c);
    }
    public int countSquares(int[][] m) {
        int ans = 0;
        for(int i = 1 ; i < m.length ; i++){
            for(int j = 1 ; j < m[0].length ; j++){
                if(m[i][j] >= 1){
                    int min = Math.min(m[i-1][j] , Math.min(m[i][j-1], m[i-1][j-1]));
                    m[i][j] +=min;
                }
            }
        }
        for(int i = 0; i < m.length ; i++){
            for(int j = 0; j < m[0].length ; j++){
                ans += m[i][j];
            }
        }
        return ans;
    }
}
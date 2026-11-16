class Solution {
    boolean check = false;
    public void find(int m1 [][] , int m2 [][] , int i , int j){
        if(i < 0 || j < 0 || j >= m2[0].length || i >= m2.length){return;}
        if(m2[i][j] == 1 && m1[i][j] == 0 ){check = true;}
        if( m2[i][j] != m1[i][j] ){return;}
        if(m1[i][j] == 1 && m2[i][j] == 1){
            m2[i][j] = 0;
            find(m1 , m2 , i+1 , j);
            find(m1 , m2 , i , j+1);
            find(m1 , m2 , i-1 , j);
            find(m1 , m2 , i , j-1);
        }
    }
    public int countSubIslands(int[][] m1, int[][] m2) {
        int cc = 0;
        for(int i = 0 ; i < m1.length ; i++){
            for(int j = 0 ; j < m1[0].length ; j++){
                if(m1[i][j] == 1 && m2[i][j] == 1){
                    find(m1 , m2 , i , j);
                    if(check == false){cc++;}
                }
                check = false;
            }
        }
        return cc;
    }
}
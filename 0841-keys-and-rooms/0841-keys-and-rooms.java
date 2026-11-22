class Solution {
    public void fun(List<List<Integer>> rooms , boolean vis [] , int s ){
        if(vis[s]){return;}
        vis[s] = true;
        for(int i : rooms.get(s)){
            fun(rooms,vis,i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        //List<Integer> al = new ArrayList<>();
        if(rooms.size() == 0){return false;}
        boolean vis [] = new boolean [rooms.size()];
        fun(rooms , vis , 0);
        for(int i = 0 ; i < vis.length ; i++){
            if(vis[i] == false){
                return false;
            }
        }
        return true;
    }
}
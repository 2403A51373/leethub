class Solution {
    public int findTheWinner(int n, int k) {
        if(k ==1){return n;}
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            al.add(i+1);
        }
        int id = 0;
        while(al.size()!=1){
            id = (id+k-1)%al.size();
            al.remove(id);
        }
        return al.get(0);
    }
}
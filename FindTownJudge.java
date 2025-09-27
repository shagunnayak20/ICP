class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<trust.length;i++){
            h.add(trust[i][0]);
        }
        for(int i=1;i<=n;i++){
            if(!h.contains(i)){
                int c=0;
                for(int j=0;j<trust.length;j++){
                    if(trust[j][1]==i){
                        c++;
                    }

                }
                if(c==n-1){
                    return i;
                }
            }
        }
        return -1;
    }
}

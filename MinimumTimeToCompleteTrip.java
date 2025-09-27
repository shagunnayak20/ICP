class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int n=time.length;
        int min=Integer.MAX_VALUE;
        for(int t:time){
            min=Math.min(min,t);
        }
         long l = 1L;
        long r = (long) min * (long) totalTrips;
        while(l<r){
            long mid=l+(r-l)/2;
            if(ispossible(time,mid,totalTrips)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean ispossible(int[] time,long mid, int totalTrips){
        long trip=0;
        for(int t:time){
            trip+=mid/t;
        }
        if(trip>=totalTrips){
            return true;
        }
        return false;
    }
}

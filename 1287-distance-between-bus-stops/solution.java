class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int fd=0;
        int sd=0;
        int n=distance.length;
        for(int i=start;i!=destination;i=(i+1)%n){
            fd+=distance[i];

        }
        for(int i=destination;i!=start;i=(i+1)%n){
            sd+=distance[i];

        }
        return Math.min(fd,sd);


        
    }
}

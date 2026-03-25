class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = 1001;
       int[] arr = new int[n];

       for(int i=0;i<trips.length;i++){
        int pass = trips[i][0];
        int start = trips[i][1];
        int end = trips[i][2];

        arr[start] += pass;
        arr[end] -= pass;
       }
       for(int i=1;i<arr.length;i++){
        arr[i] += arr[i-1];
       }
       int max = 0;
       for(int m : arr){
        max = Math.max(max,m);
       }
       if(max > capacity){
        return false;
       }
     return true;
    }
}
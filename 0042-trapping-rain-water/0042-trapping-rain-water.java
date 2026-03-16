class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] LeftMax = new int[n];
        int[] RightMax = new int[n];
        LeftMax[0] = height[0];
        for(int i=1;i<n;i++){
            LeftMax[i] = Math.max(LeftMax[i-1],height[i]);
        }  
        RightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i] = Math.max(RightMax[i+1],height[i]);
        }
        int totalWater = 0;
        for(int i=0;i<n-1;i++){
            int water = Math.min(LeftMax[i],RightMax[i]) - height[i];
            totalWater += water;
        }
        return totalWater;
    }
}
class Solution {
    public int trap(int[] height) {
         int lb[]= new int[height.length];
        int rb[]=new int [height.length];

        lb[0]= height[0];
        for(int i=1; i<lb.length; i++){
            lb[i]= Math.max(lb[i-1],height[i]);
        }
        rb[rb.length-1]=height[rb.length-1];
        for(int i=rb.length-2; i>=0; i--){
            rb[i]= Math.max(rb[i+1],height[i]);

        }
        int waterTrapped=0;
        for(int i=0; i<height.length; i++){
            int potentalHeight= Math.min(lb[i],rb[i]);
            waterTrapped+= potentalHeight-height[i];
        }
        return waterTrapped;
        
    }
}
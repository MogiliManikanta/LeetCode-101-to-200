class Solution {
    public long minCost(int[] nums, int x) {
        long ans = Long.MAX_VALUE;
        int n = nums.length;
        int minCost[] = new int[n];
        Arrays.fill(minCost,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            long sum = 1L*x*i;
            for(int j=0;j<n;j++){
                minCost[j] = Math.min(minCost[j],nums[(i-j+n)%n]);
                sum+=minCost[j];
            }
            ans=Math.min(ans,sum);
        }
        return ans;
    }
}
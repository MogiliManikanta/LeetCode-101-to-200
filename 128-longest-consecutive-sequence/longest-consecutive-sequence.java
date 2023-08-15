class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer>set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int result=Integer.MIN_VALUE;
        for(int i : nums){
            int left = i-1;
            int right = i+1;

            while(set.remove(left)){
                left--;
            }

            while(set.remove(right)){
                right++;
            }

            result = Math.max(result,right-left-1);
            if(set.isEmpty()){
                return result;
            }
        }
        return result;
    }
}
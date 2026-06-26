class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;

        int prefix=0;
        int suffix=0;
        for(int i=0;i<nums.length;i++){
            suffix=sum-nums[i]-prefix;
            if(prefix==suffix)
                return i;
            
            prefix+=nums[i];
        }
        return -1;
    }
}
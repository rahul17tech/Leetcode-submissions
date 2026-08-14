class Solution {
    public int first(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int firstAns=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                firstAns=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return firstAns;
    }
    public int last(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int lastAns=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                lastAns=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return lastAns;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstIndx=first(nums,target);
        int lastIndx=last(nums,target);
        return new int[]{firstIndx,lastIndx};
    }
}
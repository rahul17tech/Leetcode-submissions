class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;  // Cumulative sum
        int count = 0;  // Count of subarrays summing to k
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  // Calculate cumulative sum
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);  // Increment count by how many times (sum - k) occurred
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
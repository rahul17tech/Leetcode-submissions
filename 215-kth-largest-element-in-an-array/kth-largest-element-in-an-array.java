class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//min heap for largest element when k is small else use max heap for largest
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.peek();
    }
}
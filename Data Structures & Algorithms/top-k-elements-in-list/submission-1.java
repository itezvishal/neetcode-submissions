class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Set<Integer> l=new HashSet<>();

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            pq.add(i);
        }

        while(l.size()!=k){
            l.add(pq.poll());
            
        }
        return l.stream().mapToInt(i->i).toArray();

    }
}

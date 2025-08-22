class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < score.length; i++){
            map.put(score[i],i);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : score){
            maxHeap.add(s);
        }
        int rank = 1;
        while(!maxHeap.isEmpty()){
            int currentScore = maxHeap.poll();
            int index = map.get(currentScore);
            if(rank == 1) res[index] = "Gold Medal";
            else if(rank == 2) res[index] = "Silver Medal";
            else if(rank == 3) res[index] = "Bronze Medal";
            else res[index] = Integer.toString(rank);
            
            rank++;

        }
        return res;
    }
}

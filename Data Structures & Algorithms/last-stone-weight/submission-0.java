class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> orderedStones = Arrays.stream(stones)
                .boxed()
                .collect(Collectors.toCollection(() -> 
                            new PriorityQueue<>(Collections.reverseOrder())));
        
        while (orderedStones.size() > 1) {
            Integer heavier = orderedStones.poll();
            if (orderedStones.peek().equals(heavier)) {
                orderedStones.poll();
            } else {
                Integer remainder = heavier - orderedStones.poll();
                orderedStones.add(remainder);
            }
        }
        
        return (orderedStones.isEmpty()) ? 0 : orderedStones.poll();
    }
}

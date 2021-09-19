static int connectRopeToMinimizeCost(int[] array){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int cost =0;
        for (int element:array) {
            minHeap.add(element);
        }
        while (true){
            if (minHeap.size() == 1){
                break;
            }
           cost = minHeap.poll()+minHeap.poll();
           minHeap.add(cost);
        }
        return minHeap.poll();
    }

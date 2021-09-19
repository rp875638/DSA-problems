static String kthLargestElement(String[] array, int k){
        PriorityQueue<String> minHeap = new PriorityQueue<>();
        for (String element:array) {
            minHeap.add(element);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.poll();
 }

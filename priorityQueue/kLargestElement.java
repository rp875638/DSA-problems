static ArrayList<Integer> kLargestElement(int[] array, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int element:array) {
            minHeap.add(element);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        for (int element:minHeap) {
            result.add(element);
        }
        return result;
    }

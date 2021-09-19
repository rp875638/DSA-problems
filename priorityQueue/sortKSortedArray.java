static ArrayList<Integer> sortKSortedArray(int[] array, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int element:array) {
            minHeap.add(element);
            if (minHeap.size() > k){
                result.add(minHeap.poll());
            }
        }
        return result;
    }

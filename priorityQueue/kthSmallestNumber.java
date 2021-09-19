static int kthSmallestElement(int[] array, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int element:array) {
            maxHeap.add(element);
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.poll();
    }

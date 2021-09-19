static ArrayList<Integer> kClosestNumber(int[] array, int k, int number){
        PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>((pair1, pair2) -> {
            return pair2.difference - pair1.difference;
        });
        ArrayList<Integer> result = new ArrayList<>();
        for (int element:array) {
            maxHeap.add(new Pair(Math.abs(element-number),element));
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        for (Pair element: maxHeap) {
            result.add(element.data);
        }
        return result;
    }

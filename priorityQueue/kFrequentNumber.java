static ArrayList<Integer> kFrequentNumber(int[] array, int k, int number){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        PriorityQueue<FrequencyPair> maxHeap = new PriorityQueue<FrequencyPair>((pair1, pair2) -> {
            return pair2.frequency - pair1.frequency;
        });
        ArrayList<Integer> result = new ArrayList<>();

        for (int element:array) {
            frequencyMap.put(element,frequencyMap.getOrDefault(element,0)+1);
        }

        for (Map.Entry<Integer, Integer> element:frequencyMap.entrySet()) {
            maxHeap.add(new FrequencyPair(element.getKey(),element.getValue()));
            if (maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        for (FrequencyPair element: maxHeap) {
            result.add(element.data);
        }
        return result;
    }

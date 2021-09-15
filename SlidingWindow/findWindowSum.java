// In this solution returned ArrayList will consist sum of every window
ArrayList<Integer> findAllSumOfWindow(int[] array, int windowSize){
        ArrayList<Integer> result = new ArrayList<>();

        // find sum of k element
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i-1];
        }
        result.add(array[windowSize-1]);
        
        // sliding window and calculating its sum 
        for (int i = windowSize; i < array.length; i++) {
            result.add(array[i] - array[i-windowSize]);
        }

        return result;
    }

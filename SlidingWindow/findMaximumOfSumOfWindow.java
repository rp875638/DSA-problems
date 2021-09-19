int findMaximumOfAllSumOfWindow(int[] array, int windowSize){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            array[i] += array[i-1];
        }
        result.add(array[windowSize-1]);

        for (int i = windowSize; i < array.length; i++) {
            result.add(array[i] - array[i-windowSize]);
        }

        int maximumSum = Integer.MIN_VALUE;
        for (Integer integer : result) {
            if (integer > maximumSum) {
                maximumSum = integer;
            }
        }
        return maximumSum;
    }

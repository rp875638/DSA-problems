ArrayList<Integer> findFirstNegativeNumberOfWindow(int[] array, int windowSize){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> negativeNumbers = new LinkedList<>();

        int i=0, j;
        int length = array.length;

        for ( j = 0; j < windowSize-1; j++) {
            if (array[j] < 0)
                negativeNumbers.add(j);
        }

        while (j < length){
            if (array[j] < 0)
                negativeNumbers.add(j);

            if(negativeNumbers.isEmpty())
                result.add(0);
            else
                result.add(array[negativeNumbers.peek()]);

            if (!negativeNumbers.isEmpty() && negativeNumbers.peek() <= i)
                negativeNumbers.poll();
            i++;
            j++;
        }

        return result;
    }

ArrayList<Integer> findMaximumOfAllWindow(int[] array, int windowSize){
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int i;

        for (i = 0; i < windowSize; i++) {
            while (!deque.isEmpty() && array[i] >= array[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }

        for (; i < array.length; i++) {
            result.add(array[deque.peek()]);

            while (!deque.isEmpty() && deque.peek() <= i-windowSize)
                deque.removeFirst();

            while (!deque.isEmpty() && array[i] >= array[deque.peekLast()])
                deque.removeLast();

            deque.addLast(i);
        }

        return result;
    }

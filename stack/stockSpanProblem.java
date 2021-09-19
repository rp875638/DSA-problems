static void stockSpanProblem(int[] array){
        Stack<Integer> greaterElement = new Stack<>();
        int currentElement;
        int[] result = new int[array.length];

        for (int i=0; i<array.length; i++) {
            currentElement = i;
            if (greaterElement.isEmpty()){
                result[i] = -1;
            }
            else{
                while (!greaterElement.isEmpty() && array[greaterElement.peek()] < array[currentElement]){
                    greaterElement.pop();
                }
                if (greaterElement.isEmpty())
                    result[i] = -1;
                else
                    result[i] = greaterElement.peek();
            }
            greaterElement.push(currentElement);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = i-result[i];
        }
    }

static void nearestLeftGreaterElement(int[] array){
        Stack<Integer> smallerElement = new Stack<>();
        int currentElement;

        for (int i=0; i<array.length; i++) {
            currentElement = array[i];
            if (smallerElement.isEmpty()){
                array[i] = -1;
            }
            else{
                while (!smallerElement.isEmpty() && smallerElement.peek() < currentElement){
                    smallerElement.pop();
                }
                if (smallerElement.isEmpty())
                    array[i] = -1;
                else
                    array[i] = smallerElement.peek();
            }
            smallerElement.push(currentElement);
        }
    }

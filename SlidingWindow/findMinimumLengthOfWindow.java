int findMinimumLengthWindow(int[] array, int maximumSum){
        int i=0, j=0;
        int minimumLength = array.length;
        int length = array.length;
        int sum =0;

        while (j<length){
            if(sum < maximumSum){
                sum += array[j++];
            }
            else if(sum == maximumSum){
                if ((j-i) < minimumLength){
                    minimumLength = j-i;
                }
                sum -= array[i++];
            }
            else{
                if(i == j){
                    sum += array[j++];
                }
                else{
                    sum -= array[i++];
                }
            }
        }

        return minimumLength;
    }

int findMaximumLengthWindow(int[] array, int minimumSum){
        int i=0, j=0;
        int maximumLength = array.length;
        int length = array.length;
        int sum =0;

        while (j<length){
            if(sum < minimumSum){
                sum += array[j++];
            }
            else if(sum == minimumSum){
                if ((j-i) > maximumLength){
                    maximumLength = j-i;
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

        return maximumLength;
    }

static int findNumberOfRotationInSortedArray(int[] array){
        int left=0, right= array.length-1;
        int result=-1;
        while(left<=right){
            int mid = (right+left)/2;
            if(array[mid] < array[mid-1] && array[mid] < array[mid+1]){
                return mid;
            }
            else if(array[mid] > array[array.length-1]){
                left = mid+1;
            }
            else if(array[mid] < array[0]){
                right = mid-1;
            }
        }

        return result;
    }

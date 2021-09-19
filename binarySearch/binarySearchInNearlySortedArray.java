static int binarySearchInNearlySortedArray(int[] array,int left,int right, int searchElement){
        while(left<=right){
            int mid = (right+left)/2;
            if(array[mid] == searchElement){
                return mid;
            }
            if(mid-1 >= 0 && array[mid-1] == searchElement){
                return mid-1;
            }
            if(mid+1 <= array.length-1 && array[mid] == searchElement){
                return mid+1;
            }
            else if(mid-2 >= 0 && array[mid] > searchElement){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }

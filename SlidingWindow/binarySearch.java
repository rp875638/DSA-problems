static int binarySearch(int[] array,int left,int right, int searchElement){
        while(left<=right){
            int mid = (right+left)/2;
            if(array[mid] == searchElement){
                return mid;
            }
            else if(array[mid] > searchElement){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }

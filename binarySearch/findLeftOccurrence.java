static int findLeftOccurrence(int[] array, int searchElement){
        int left=0, right= array.length-1;
        int result=-1;
        while(left<=right){
            int mid = (right+left)/2;
            if(array[mid] == searchElement){
                result = mid;
                right = mid-1;
            }
            else if(array[mid] > searchElement){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return result;
    }

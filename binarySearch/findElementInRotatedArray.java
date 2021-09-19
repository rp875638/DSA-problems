static int findElementInRotatedArray(int[] array, int searchElment){
        int index = findNumberOfRotationInSortedArray(array);
        int result1 = binarySearch(array,0,index-1,searchElment);
        int result2 = binarySearch(array,index,array.length-1,searchElment);
        if (result1 >-1){
            return result1;
        }
        else if (result2 >-1){
            return result2;
        }
        else{
            return -1;
        }
    }

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

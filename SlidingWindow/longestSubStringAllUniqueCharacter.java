int longestSubstringWithAllUniqueCharacter(String str){
        int maximumSubstringLength = 0;
        char[] strCharArray = str.toCharArray();
        int lengthOfString = str.length();

        HashMap<Character, Integer> uniqueCharactersArray = new HashMap<>();

        int i=0, j=0;

        while (j < lengthOfString){
            if (uniqueCharactersArray.containsKey(strCharArray[j])){
                uniqueCharactersArray.put(strCharArray[j], uniqueCharactersArray.get(strCharArray[j])+1);

                while (uniqueCharactersArray.get(strCharArray[j]) > 1){
                    uniqueCharactersArray.put(strCharArray[i], uniqueCharactersArray.get(strCharArray[i])-1);

                    if (uniqueCharactersArray.get(strCharArray[i]) == 0){
                        uniqueCharactersArray.remove(strCharArray[i]);
                    }
                    i++;
                }
            }
            else {
                uniqueCharactersArray.put(strCharArray[j],1);
            }

            if (uniqueCharactersArray.size() > maximumSubstringLength){
                maximumSubstringLength = uniqueCharactersArray.size();
            }
            j++;
        }

        return maximumSubstringLength;
    }

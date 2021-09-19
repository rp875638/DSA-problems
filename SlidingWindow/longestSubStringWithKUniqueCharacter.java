int longestSubstringWithKUniqueCharacter(String str, int uniqueCharacters){
        int maximumSubstringLength = 0;
        char[] strCharArray = str.toCharArray();
        int lengthOfString = str.length();

        HashMap<Character, Integer> uniqueCharactersArray = new HashMap<>();

        int i=0, j=0;

        while (j < lengthOfString){
            if (uniqueCharactersArray.containsKey(strCharArray[j])){
                uniqueCharactersArray.put(strCharArray[j], uniqueCharactersArray.get(strCharArray[j])+1);
            }
            else {
                uniqueCharactersArray.put(strCharArray[j],1);
            }

            while (uniqueCharactersArray.size() > uniqueCharacters){
                uniqueCharactersArray.put(strCharArray[i], uniqueCharactersArray.get(strCharArray[i])-1);

                if (uniqueCharactersArray.get(strCharArray[i]) == 0){
                    uniqueCharactersArray.remove(strCharArray[i]);
                }
                i++;
            }


            if (uniqueCharactersArray.size() == uniqueCharacters && maximumSubstringLength < j-i+1){
                maximumSubstringLength = j-i+1;
            }

            j++;
        }

        return maximumSubstringLength;
    }

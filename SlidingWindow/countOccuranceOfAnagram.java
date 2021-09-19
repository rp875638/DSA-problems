int CountOccurrencesOfAnagrams(String str, String substr){
        int windowSize = substr.length();
        int lengthString = str.length();
        char[] strCharArray = str.toCharArray();
        char[] substrCharArray = substr.toCharArray();

        HashMap<Character, Integer> mapOfSubstringCharacter = new HashMap<>();

        for (char c:substrCharArray) {
            if(mapOfSubstringCharacter.containsKey(c))
                mapOfSubstringCharacter.put(c , mapOfSubstringCharacter.get(c)+1);
            else
                mapOfSubstringCharacter.put(c,1);
        }

        int sizeOfMap = mapOfSubstringCharacter.size();
        int result = 0;
        int i=0, j;

        for (j = 0; j < windowSize-1; j++) {
            if(mapOfSubstringCharacter.containsKey(strCharArray[j])){
                mapOfSubstringCharacter.put(strCharArray[j], mapOfSubstringCharacter.get(strCharArray[j])-1);

                if (mapOfSubstringCharacter.get(strCharArray[j]) == 0)
                    sizeOfMap--;
                else if(mapOfSubstringCharacter.get(strCharArray[j]) == -1)
                    sizeOfMap++;
            }
        }

        while(j < lengthString){
            if(mapOfSubstringCharacter.containsKey(strCharArray[j])){
                mapOfSubstringCharacter.put(strCharArray[j], mapOfSubstringCharacter.get(strCharArray[j])-1);

                if (mapOfSubstringCharacter.get(strCharArray[j]) == 0)
                    sizeOfMap--;
                else if(mapOfSubstringCharacter.get(strCharArray[j]) == -1)
                    sizeOfMap++;
            }

            if (sizeOfMap == 0)
                result++;

            if(mapOfSubstringCharacter.containsKey(strCharArray[i])){
                mapOfSubstringCharacter.put(strCharArray[i], mapOfSubstringCharacter.get(strCharArray[i])+1);

                if (mapOfSubstringCharacter.get(strCharArray[i]) == 0)
                    sizeOfMap--;
                else if(mapOfSubstringCharacter.get(strCharArray[i]) == 1)
                    sizeOfMap++;
            }

            i++;
            j++;
        }

        return result;
    }

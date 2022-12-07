class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indexes = new ArrayList<Integer>();
        int lengthOfOneWord = words[0].length();
        int lengthOfSubstring = lengthOfOneWord * words.length;
        for(int i=0; i<s.length(); i++){
            boolean flag = false;
            if(i+lengthOfSubstring > s.length()){break;}
            String sub = s.substring(i, i+lengthOfSubstring);
            List<String> copy = new ArrayList<String>(Arrays.asList(words));
            for(int j=0; j<lengthOfSubstring;){
                if(!(copy.contains(sub.substring(j, j+lengthOfOneWord)))){
                    flag = true;
                    break;
                }else{
                    copy.remove(sub.substring(j, j+lengthOfOneWord));
                }
                j = j+lengthOfOneWord;
                if(j >= lengthOfSubstring){break;}
            }
            if(!flag){
                indexes.add(i);
            }
        }
        return indexes;
    }
    }
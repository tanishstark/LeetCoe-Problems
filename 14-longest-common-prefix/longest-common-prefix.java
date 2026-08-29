class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder newStr = new StringBuilder("");

        for(int i = 0; i< strs[0].length();i++){
            char current = strs[0].charAt(i);

            for(int j = 0; j < strs.length; j++){
                if(i >= strs[j].length() || current != strs[j].charAt(i)){
                    return newStr.toString();
                }
            }
            newStr.append(current);
        }
        return newStr.toString();
    }
}
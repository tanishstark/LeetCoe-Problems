class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");

        int left = 0;
        int right = 0;

        while(left < s.length()){
            if(s.charAt(left) == '#' && str1.length() > 0){
                str1.deleteCharAt(str1.length() - 1);
            }else if(s.charAt(left) != '#'){
                str1.append(s.charAt(left));    
            }
            left++;
        }
        left = 0;
        while(left < t.length()){
            if(t.charAt(left) == '#' && str2.length() > 0){
                str2.deleteCharAt(str2.length() - 1);

            }else if(t.charAt(left) != '#'){
                str2.append(t.charAt(left));
                  
            }
            left++;
        }

        return str1.compareTo(str2) == 0;
    }
}
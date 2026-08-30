class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++){
            if(i > 0 && sb.charAt(i) == ')' && sb.charAt(i - 1) == '('){
                sb.deleteCharAt(i);
                i--;
                sb.deleteCharAt(i);
                i--;
            }
            if(i > 0 && sb.charAt(i) == '}' && sb.charAt(i - 1) == '{'){
                sb.deleteCharAt(i);
                i--;
                sb.deleteCharAt(i);
                i--;
            }
            if(i > 0 && sb.charAt(i) == ']' && sb.charAt(i - 1) == '['){
                sb.deleteCharAt(i);
                i--;
                sb.deleteCharAt(i);
                i--;
            }
        }
        if(sb.length() == 0){
            return true;
        }else{
            return false;
        }
    }
}
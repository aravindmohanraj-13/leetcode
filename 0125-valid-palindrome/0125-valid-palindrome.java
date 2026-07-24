class Solution {
    boolean isAlphaNum(char s){
        if((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z') ||
            (s >= '0' && s <= '9') ){
                return true;
            }
        return false;
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(isAlphaNum(l) && isAlphaNum(r)){
                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }else{
                    left++;
                    right--;
                }
            }else{
                if(!isAlphaNum(l)) left++;
                if(!isAlphaNum(r)) right--;
            }
        }
        return true;
    }
}
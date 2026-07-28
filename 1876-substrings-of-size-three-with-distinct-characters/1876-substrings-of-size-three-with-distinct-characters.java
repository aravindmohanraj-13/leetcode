class Solution {
    public int countGoodSubstrings(String s) {
        int i = 0;
        int count = 0;
        String str = "";
        int n = s.length();
        for(int j = 0 ; j < n ; j++){
            str += s.charAt(j);
            if(j - i + 1 == 3){
                if(str.charAt(0) != str.charAt(1) && str.charAt(1) != str.charAt(2) && 
                    str.charAt(0) != str.charAt(2)){
                        count ++;
                }
                str = str.substring(1);
                i++;
            } 
        }
        return count;
    }
}
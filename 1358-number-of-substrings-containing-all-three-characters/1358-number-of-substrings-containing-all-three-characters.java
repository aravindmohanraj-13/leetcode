class Solution {
    public int numberOfSubstrings(String s) {
        int[] visited = {-1, -1, -1};
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            visited[s.charAt(i) - 'a'] = i;
            if(visited[0] != -1 && visited[1] != -1 && visited[2] != -1){
                count += 1 + Math.min(visited[0], Math.min(visited[1], visited[2]));
            }   
        }
        return count;
    }
}
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] piece = my_string.toCharArray();
        
        for(int i=0;i<piece.length;i++) {
            answer += String.valueOf(piece[i]).repeat(n);
        }
        
        return answer;
    }
}
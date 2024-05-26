class Solution {
    public String solution(int age) {
        String alpha[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String answer = "";
        String ageStr = String.valueOf(age);
        
        for(int i=0; i<ageStr.length(); i++) {
            answer += alpha[ageStr.charAt(i) - '0'];
        }
        
        return answer;
    }
}
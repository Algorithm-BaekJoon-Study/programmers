package week13.suding;

public class 외계행성의_나이 {
    class Solution {
        public String solution(int age) {
            String answer = "";
            String strAge = String.valueOf(age);
            for(int i = 0; i < strAge.length(); i++){
                char ch = strAge.charAt(i);
                int numericValue = Character.getNumericValue(ch);
                char alphabetChar = (char) ('a' + numericValue);
                answer += alphabetChar;
            }
            return answer;
        }
    }
}

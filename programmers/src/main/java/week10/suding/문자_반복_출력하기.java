package week10.suding;

public class 문자_반복_출력하기 {
    class Solution {
        public String solution(String my_string, int n) {
            StringBuilder answerBuilder = new StringBuilder();

            for(int i = 0; i < my_string.length(); i++) {
                for(int j = 0; j < n; j++) {
                    answerBuilder.append(my_string.charAt(i));
                }
            }

            String answer = answerBuilder.toString();
            return answer;
        }
    }

}

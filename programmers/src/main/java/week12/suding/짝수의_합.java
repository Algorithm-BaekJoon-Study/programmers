package week12.suding;

public class 짝수의_합 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 2; i <= n; i += 2) {
                answer += i;
            }
            return answer;
        }
    }
}

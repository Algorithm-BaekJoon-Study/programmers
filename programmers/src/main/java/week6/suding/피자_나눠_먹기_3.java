package week6.suding;

public class 피자_나눠_먹기_3 {
    class Solution {
        public int solution(int slice, int n) {
            int answer = 0;

            if (n % slice == 0) {
                answer = n / slice;
            } else {
                answer = n / slice + 1;
            }

            return answer;
        }
    }
}

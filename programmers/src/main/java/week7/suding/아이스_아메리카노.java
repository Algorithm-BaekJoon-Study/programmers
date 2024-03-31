package week7.suding;

public class 아이스_아메리카노 {
    class Solution {
        public int[] solution(int money) {
            int cup = money / 5500;
            int changes = money % 5500;
            int[] answer = {cup, changes};
            return answer;
        }
    }
}

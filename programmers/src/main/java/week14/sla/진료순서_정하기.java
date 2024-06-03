package programmers.src.main.java.week14.sla;

public class 진료순서_정하기 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }
}

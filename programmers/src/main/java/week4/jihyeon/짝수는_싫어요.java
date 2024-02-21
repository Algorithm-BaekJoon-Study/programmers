package week4.jihyeon;

import java.util.stream.IntStream;

public class 짝수는_싫어요 {

    public int[] solution(int n) {
        int count = (n + 1) / 2;
        int[] answer = new int[count];

        for (int i = 0; i < count; i++) {
            answer[i] = i * 2 + 1;
        }

        return answer;
    }

    public int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

}

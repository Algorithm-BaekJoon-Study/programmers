package week2.jihyeon;

import java.util.Arrays;

public class 배열_두_배_만들기 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(n -> n * 2).toArray();
    }
}

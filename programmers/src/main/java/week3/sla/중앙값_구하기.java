package week3.sla;

import java.util.Arrays;

public class 중앙값_구하기 {
    public int solution(int[] array) {

        Arrays.sort(array);
        return array[array.length/2];
    }
}

/*
오름차순 정렬 Arrays.sort()
내림차순 정렬 Arrays.sort(arr, Collections.reverseOrder());
일부만 정렬 Arrays.sort(arr, 0, 4);
*/

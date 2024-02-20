import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0; // 최빈값
        int max = 0;
        
        Arrays.sort(array);
        max = array[array.length-1]; // 가장 큰 수를 max로 설정
        
        int count[] = new int[max+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++; // 각 수의 index에 카운트
        }
        
        max = count[0];
        
        for(int i=0;i<count.length;i++){
            if(max < count[i]){
                max = count[i];
                answer = i; // max값이 바뀔 때의 index(array[i], 최빈값)
            }
        }
        
        // 최빈값이 여러 개 있는지 확인
        int freq = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                freq++;
            }
        }

        // 최빈값이 여러 개라면 -1 반환
        if (freq > 1) {
            return -1;
        }
        
        return answer;
    }
}
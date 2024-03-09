package week2.sla;

public class 배열_두배_만들기 {
    public int[] solution(int[] numbers) {

        //배열 크기지정
        int[] answer = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){

            answer[i] = numbers[i]*2;

        }
        return answer;

    }
}

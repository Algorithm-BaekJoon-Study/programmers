package week5.sla;

public class 피자_나눠_먹기_2 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(i * 6 % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

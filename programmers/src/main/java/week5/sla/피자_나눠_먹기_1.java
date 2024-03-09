package week5.sla;

public class 피자_나눠_먹기_1 {
    public int solution(int n) {
        int answer = 0;

        if(n%7==0){
            answer = n/7;
        } else{
            answer = n/7+1;
        }
        return answer;
    }
}

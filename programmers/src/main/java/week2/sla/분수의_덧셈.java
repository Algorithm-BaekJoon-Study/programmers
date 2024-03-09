package week2.sla;

public class 분수의_덧셈 {
    public int[] solution(int denom1, int numer1, int denom2, int numer2) {
        int[] answer = new int[2];

        int numer = numer1*numer2;
        int denom = denom1*numer2+denom2*numer1;
        int max = 1;

        for(int i=1; i <= numer && i<= denom; i++){
            if(numer%i==0 && denom%i==0){
                max = i;
            }
        }
        answer[0] = denom/max;
        answer[1] = numer/max;

        return answer;
    }
}

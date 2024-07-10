package programmers.src.main.java.week14.sla;

public class 순서쌍의_개수 {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                count++;
            }
        }
        return count;
    }
}

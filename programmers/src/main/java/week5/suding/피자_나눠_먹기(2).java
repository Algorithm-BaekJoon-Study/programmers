class 피자_나눠_먹기(2) {
    public int solution(int n) {
        int answer = 1;

        while(true) {
            if(6*answer%n==0)
                break;
            answer++;
        }
        return answer;
    }
}
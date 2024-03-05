package week5.suding;

class 피자_나눠_먹기_1 {
    public int solution(int n) {
        int answer = 0;
        int pizza = 7;

        if (n % pizza == 0) {
            answer = n / pizza;
        } else {
            answer = n / pizza + 1;
        }

        return answer;
    }
}


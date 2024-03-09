package week1.sla;

public class 두_수의_나눗셈 {
    public int solution(int num1, int num2) {
        double answer = (double)num1/num2*1000;
        //실수형으로 변환
        return (int)answer;
    }
}

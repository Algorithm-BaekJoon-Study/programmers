package week11.sla;

public class 특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
}

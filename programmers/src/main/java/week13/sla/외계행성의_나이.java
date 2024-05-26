package programmers.src.main.java.week13.sla;

public class 외계행성의_나이 {
    public String solution(int age) {
        String answer = "";
        String age962 = String.valueOf(age);
        for(int i=0;i<age962.length();i++){

            answer += (char)(age962.charAt(i)+49);
        }
        return answer;
    }
}

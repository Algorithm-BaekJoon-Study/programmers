package programmers.src.main.java.week15.sla;

public class 모스부호_1 {
    public String solution(String letter) {

        String answer = "";

        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morse = letter.split(" ");

        for(String s : morse) {
            for(int i = 0; i < morseList.length; i++) {
                if(s.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }
}

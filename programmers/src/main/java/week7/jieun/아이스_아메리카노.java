class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int americano = (int)(money / 5500);
        int change = (int)(money % 5500);
        
        answer[0] = americano;
        answer[1] = change;
        
        return answer;
    }
}
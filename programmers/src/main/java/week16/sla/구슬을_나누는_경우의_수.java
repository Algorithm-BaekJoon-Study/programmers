package programmers.src.main.java.week16.sla;

public class 구슬을_나누는_경우의_수 {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share){
        if (balls == share || share == 0)
            return 1;
        return combination((balls -1), (share -1)) + combination(balls - 1, share);
    }
}

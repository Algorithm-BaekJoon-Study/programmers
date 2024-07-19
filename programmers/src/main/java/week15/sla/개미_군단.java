package programmers.src.main.java.week15.sla;

public class 개미_군단 {
    public int solution(int hp) {

    int cnt = 0;

    cnt +=(hp / 5);
    hp %=5;

    cnt += (hp/3);
    hp %= 3;

    cnt +=(hp/1);

    return cnt;
}
}

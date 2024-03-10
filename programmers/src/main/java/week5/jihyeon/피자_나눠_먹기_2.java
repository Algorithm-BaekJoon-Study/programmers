package week5.jihyeon;

class 피자_나눠_먹기_2 {
    public int solution(int n) {
        int piece = 6;
        if (n % piece == 0) {
            return n / piece;
        }

        return n / gcd(n, piece);
    }

    public static int gcd(int n, int piece) {
        while (piece != 0) {
            int temp = n % piece;
            n = piece;
            piece = temp;
        }

        return n;
    }
}

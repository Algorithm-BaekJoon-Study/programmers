package week2.jihyeon;

public class 분수의_덧셈 {

    public int[] solution(int numerator1, int denominator1, int numerator2, int denominator2) {
        int resultNumerator = numerator1 * denominator2 + numerator2 * denominator1;
        int resultDenominator = denominator1 * denominator2;

        return reduceFraction(resultNumerator, resultDenominator);
    }

    private int[] reduceFraction(int resultNumerator, int resultDenominator) {
        int maximumCommonDivisor = calculateMaximumCommonDivisor(resultNumerator, resultDenominator);

        return new int[] {resultNumerator / maximumCommonDivisor, resultDenominator / maximumCommonDivisor};
    }

    private int calculateMaximumCommonDivisor(int resultNumerator, int resultDenominator) {
        while (resultDenominator != 0) {
            int temp = resultNumerator % resultDenominator;
            resultNumerator = resultDenominator;
            resultDenominator = temp;
        }

        return Math.abs(resultNumerator);
    }
}

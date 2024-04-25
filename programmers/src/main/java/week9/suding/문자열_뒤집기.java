package week9.suding;

public class 문자열_뒤집기 {
    class Solution {
        public String solution(String my_string) {

            StringBuilder sb = new StringBuilder(my_string).reverse();

            return sb.toString();
        }
    }
}

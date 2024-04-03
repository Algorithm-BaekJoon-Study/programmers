class Solution {
    public int solution(int age) {
        int base_year = 2022;
        
        int birth_year = base_year - age + 1;
        
        return birth_year;
    }
}
class Solution {
    public int solution(int people) {
        int pizza = 0;
        int piece = 7;
        
        for(int i=1;i<=piece*people;i++){
            if(people <= i*piece){
                pizza = i;
                break;
            }
        }
        
        return pizza;
    }
}
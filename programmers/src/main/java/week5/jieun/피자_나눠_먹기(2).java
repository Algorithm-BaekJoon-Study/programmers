class Solution {
    public int solution(int people) {
        int pizza = 0;
        int piece = 6;
        
        for(int i=1;i<=piece*people;i++){
            if(i*piece % people == 0){
                pizza = i;
                break;
            } 
        }
        
        return pizza;
    }
}
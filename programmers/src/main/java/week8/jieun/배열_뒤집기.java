class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list.length - 1;
        
        for(int i=0;i<num_list.length/2;i++) {
            int temp = num_list[i];
            num_list[i] = num_list[last - i];
            num_list[last - i] = temp;
        }
        
        return num_list;
    }
}
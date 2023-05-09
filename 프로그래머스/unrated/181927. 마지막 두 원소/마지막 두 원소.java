class Solution {
    public int[] solution(int[] num_list) {
        int num = num_list.length-1;
        int[] answer = new int[num+2];
        int i = 0;
        for(int a : num_list) {
            answer[i] = a;
            i++;
        }
        
        if(i == num+1) {
            if(num_list[num-1] < num_list[num]) {
                    answer[num+1] = num_list[num] - num_list[num-1];
            }
            else {
                answer[num+1] = num_list[num]*2;
            }
        }
        
        return answer;
    }
}
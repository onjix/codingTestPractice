import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a = "";
        String b = "";
        int i = 0;
        for(int c : num_list) {
            if(c % 2 ==1) {
                a = a + c;
            }
            else {
                b = b+c;
            }
            i++;
        }
        
        answer = Integer.parseInt(a)+Integer.parseInt(b);
        return answer;
    }
}
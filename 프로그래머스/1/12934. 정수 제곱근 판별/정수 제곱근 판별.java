import java.lang.Math;
class Solution {
    public double solution(long n) {
        double answer = 1;
        double num = Math.sqrt(n);
        if(num == (int)num) {
            int ans = (int)num;
            answer = Math.pow(ans+1, 2);
            
            return answer;
        }
        return -1;
    }
}
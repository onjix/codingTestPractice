import java.lang.Math;
class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        for(int i=0;i<answer.length;i++) {
            answer[i] = (int)(n % 10);
            n = n/10;
        }
        
        return answer;
    }
}
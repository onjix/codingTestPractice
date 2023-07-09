class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i=0;
        int f=0;
        if(a > b) {
            i=b;
            f=a;
        }
        else {
            i=a;
            f=b;
        }
        for(;i<=f;i++) {
            answer += i;
        }
        return answer;
    }
}
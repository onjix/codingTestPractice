class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 ==1) {
            for(int i=1;i<=n;i++) {
                if(i % 2 ==1) {
                    answer +=i;
                }
                
            }
        }
        else {
            for(int j=1;j<=n;j++) {
                if(j % 2 ==0) {
                    answer += Math.pow(j, 2);
                }
                
            }
        }
        return answer;
    }
}
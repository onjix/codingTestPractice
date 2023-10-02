class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int v = 0;
        boolean value = false;
        for(int i=0;i<10;i++) {
            for(int n : numbers) {
                if(i == n) {
                    value = true;
                    break;
                } else {
                    value = false;
                }
            }
            if(value == false) {
                answer += i;
            }
        }
        return answer;
    }
}
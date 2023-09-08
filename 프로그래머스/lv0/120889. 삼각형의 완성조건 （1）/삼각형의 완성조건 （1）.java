class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int[] num = new int[3];
        num[0] = sides[0] + sides[1];
        num[1] = sides[1] + sides[2];
        num[2] = sides[0] + sides[2];
        if(num[0] > sides[2] & num[1]>sides[0] & num[2] >sides[1]) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        
        return answer;
    }
}
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean result1 = x1 | x2;
        boolean result2 = x3 | x4;
        answer = result1 & result2;
        return answer;
    }
}
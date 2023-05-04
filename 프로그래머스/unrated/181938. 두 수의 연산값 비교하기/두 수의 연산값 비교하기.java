class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        int num1 = Integer.parseInt(a1+b);
        int num2 = 2*a*b;
        if(num1 > num2) {
            answer = num1;
        }
        else if(num1 < num2) {
            answer = num2;
        }
        else {
            answer = num1;
        }
        
        
        return answer;
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = String.valueOf(a);
        int num1 = Integer.parseInt(a1+b); 
        int num2 = Integer.parseInt(b+a1);
        
        System.out.print(num1);
        if(num1 > num2)
            answer = num1;
        else {
            answer = num2;
        }
        return answer;
    }
}
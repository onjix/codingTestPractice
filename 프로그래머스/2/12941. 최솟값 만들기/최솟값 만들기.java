import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int count = A.length;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int h=0;h<count;h++) {
            answer += A[h] * B[count-h-1];
        }
        return answer;
    }
}
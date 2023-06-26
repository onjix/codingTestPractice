import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> s = new Stack<>();
        int answer = 0;
        for(int n : moves) {
            for(int j=0;j<board.length;j++) {
                if(board[j][n-1] != 0) {
                    if(s.empty()) {
                        s.push(board[j][n-1]);
                        board[j][n-1] = 0;
                        break;
                    }
                    else {
                        System.out.print("스택위값:"+ s.peek() + " /  ");
                        System.out.print("j:"+ j + " /  ");
                        System.out.println("인형:"+ board[j][n-1]);
                       if(s.peek() == board[j][n-1]) {
                           s.pop();
                           board[j][n-1] = 0;
                           answer++; 
                           break;
                       }
                        else {
                            s.push(board[j][n-1]);
                            board[j][n-1] = 0;
                            break;
                        } 
                    }
                }
            }
        }
        // for(int i=0;i<board.length;i++) {
        //     for(int h=0;h<board.length;h++) {
        //         System.out.print(board[i][h] + " ");
        //     }
        //     System.out.println();
        // }
        answer = answer *2;
        return answer;
    }
}
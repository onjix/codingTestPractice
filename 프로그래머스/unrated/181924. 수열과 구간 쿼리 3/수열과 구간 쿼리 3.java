class Solution {
    public int[] change(int[] arr, int a, int b) {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
    
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        for(int i=0; i<queries.length;i++) {
            change(arr, queries[i][0], queries[i][1]);
            
        }
        return arr;
    }
}
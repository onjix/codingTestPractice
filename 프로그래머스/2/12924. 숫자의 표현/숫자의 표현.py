def solution(n):
    answer = 0
    for i in range(1, n+1):
        finn = 0
        for j in range(i, n+1):
            finn += j
            if finn == n:
                answer += 1
                break;
            elif finn > n:
                break;
        
    return answer
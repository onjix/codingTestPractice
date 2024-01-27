def solution(n, k):
    answer = []
    size = int(n/k)
    for i in range(1, size+1):
        answer.append(k * i)
    
    return answer
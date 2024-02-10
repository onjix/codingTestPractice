import math
def solution(n,a,b):
    answer = 0
    for i in range(int(n/2)):
        if ((a+1) == b or (a-1) == b) and (math.ceil(a/2) == math.ceil(b/2)):
            answer += 1
            return answer
        a = math.ceil(a/2)
        b = math.ceil(b/2)
        answer += 1
def solution(arr):
    answer = []
    for a in arr:
        try:
            if answer[-1] == a:
                continue
            else:
                answer.append(a)
        except:
            answer.append(a)
            
            
    return answer
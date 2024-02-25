def solution(phone_book):
    answer = True
    pb = sorted(phone_book)
    l = len(pb)
    
    for i in range(l-1):
        a = pb[i]
        b = pb[i+1]
        if a == b[:len(a)]:
            answer = False   
    return answer
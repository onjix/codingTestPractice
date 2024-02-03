def solution(n):
    answer = n+1
    ncnt = str(bin(n)[2:]).count('1')
    acnt = 0
    while answer > n:
        acnt = str(bin(answer)[2:]).count('1')
        if ncnt == acnt:
            break;
        answer += 1
        
    return answer
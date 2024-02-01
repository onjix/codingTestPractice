def solution(s):
    answer = True
    cnt1 = 0
    cnt2 = 0
    for i in s:
        if '(' == i:
            cnt1 += 1
        else:
            cnt2 += 1
        if cnt1 < cnt2:
            return False
    return cnt1 == cnt2
def solution(s):
    answer = True
    nl = list(s)
    cnt1 = 0
    cnt2 = 0
    if nl[0] == ')':
        return False
    for i in nl:
        if '(' == i:
            cnt1 += 1
        else:
            cnt2 += 1
        if cnt1 < cnt2:
            return False
    if cnt1 == cnt2:
        return True
    else:
        return False
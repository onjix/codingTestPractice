from collections import Counter
def solution(k, tangerine):
    answer = 0
    num = 0
    dup = {}
    for i in tangerine:
        if i in dup:
            dup[i] += 1
        else:
            dup[i] = 1
    li = list(dup.values())
    li = sorted(li, reverse=True)
    # li.sort(reverse=True)
    for l in li:
        num += l
        answer += 1
        if k <= num:
            return answer
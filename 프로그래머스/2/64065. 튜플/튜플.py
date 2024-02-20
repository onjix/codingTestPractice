from collections import Counter
def solution(s):
    answer = []
    s = s.replace('{', '')
    s = s.replace('}', '')
    lst = s.split(',')
    cntList = Counter(lst)
    cntList = cntList.most_common()
    for key in cntList:
        answer.append(int(key[0]))
    return answer
from collections import Counter
def solution(participant, completion):
    answer = ''
    cnt = Counter(participant) - Counter(completion)
    for c in cnt:
        answer += c

    return answer
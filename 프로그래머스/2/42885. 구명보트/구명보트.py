from collections import deque
def solution(people, limit):
    answer = 0
    people.sort()
    deq = deque(people)
    while len(deq) > 0:
        if len(deq) == 1:
            answer += 1
            return answer
        
        if deq[0] + deq[-1] > limit:
            deq.pop()
            answer += 1
        elif deq[0] + deq[-1] <= limit:
            deq.pop()
            deq.popleft()
            answer += 1
        
    return answer
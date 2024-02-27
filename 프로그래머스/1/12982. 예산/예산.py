def solution(d, budget):
    answer = []
    d = sorted(d)
    s = 0
    for value in d:
        s += value
        if s <= budget:
            answer.append(0)
    return len(answer)
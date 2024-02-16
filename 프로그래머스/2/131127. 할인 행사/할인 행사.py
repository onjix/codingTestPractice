from collections import Counter
def solution(want, number, discount):
    answer = 0
    i = 0
    tl = len(discount) - 10
    while i <= tl:
        saleCnt = Counter(discount[i:i+10])
        if all(num == saleCnt[product] for product, num in zip(want, number)):
            answer +=1
        i += 1
    return answer
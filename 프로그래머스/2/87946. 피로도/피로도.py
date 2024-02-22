from itertools import *
def solution(k, dungeons):
    answer = []
    randomD = permutations(dungeons, len(dungeons))  #순열함수
    for rand in randomD:
        exploreCnt = 0
        copyk = k
        for needk, usek in rand:
            if needk <= copyk:
                copyk -= usek
                exploreCnt += 1
            else:
                break
        answer.append(exploreCnt)
    return max(answer)
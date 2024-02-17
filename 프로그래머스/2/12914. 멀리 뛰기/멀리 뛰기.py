def solution(n):
    eachCount = [0 for __ in range(max(3, n+1))]
    eachCount[0], eachCount[1], eachCount[2] = 0, 1, 2
    for i in range(3, n+1):
        eachCount[i] = eachCount[i-1] + eachCount[i-2]
    return eachCount[n] % 1234567

#이거는 0부터 최종값으로 생각하지 말고 최종값에서 0으로 가는 방향으로 생각하면 되네
def solution(n):
    ans = 0
    while n > 0:
        if n % 2 == 0:
            n /= 2
        else:
            n -= 1
            ans += 1
    return ans
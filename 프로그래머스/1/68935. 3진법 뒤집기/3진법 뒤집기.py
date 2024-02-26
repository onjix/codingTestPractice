def solution(n):
    st = ""
    while n > 0:
        n, mod = divmod(n, 3)
        st += str(mod)
    return int(st, 3)
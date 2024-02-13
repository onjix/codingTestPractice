from collections import deque
import numpy as np
def solution(s):
    l = len(s)
    lst = list(s)
    lst = np.array(lst)
    cnt = 0
    for i in range(0, l-1):
        s = []
        for t in lst:
            if s :
                if t == ')' and s[-1] == '(':
                    s.pop()
                elif t == ']' and s[-1] == '[':
                    s.pop()
                elif t == '}' and s[-1] == '{':
                    s.pop()
                else:
                    s.append(t)
            else:
                s.append(t)
        if len(s) == 0:
            cnt += 1
        lst = np.roll(lst, -1)
    return cnt
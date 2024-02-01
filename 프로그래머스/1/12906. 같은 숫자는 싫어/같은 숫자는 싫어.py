def solution(arr):
    answer = []
    for a in arr:
        try:
            if answer[-1] == a:
                continue
            else:
                answer.append(a)
        except:
            answer.append(a)
    return answer
# def solution(s):
#     a = []
#     for i in s:
#         if a[-1:] == [i]: continue
#         a.append(i)
#     return a
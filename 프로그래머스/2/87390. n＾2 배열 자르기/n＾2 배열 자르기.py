def solution(n, left, right):
    answer = []
    for i in range(left, right+1):
        y, x = i//n, i%n
        answer.append(max(y, x)+1)
    return answer
#     answer = []
#     for i in range(n):
#         for j in range(n):
#             answer.append(max(i, j) + 1)
    
#     return answer[left:right+1] 이렇게 하면 너무 오래걸린다

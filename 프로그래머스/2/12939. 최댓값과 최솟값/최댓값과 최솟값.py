def solution(s):
    ar = s.split(' ')
    numlist = [eval(i) for i in ar]
    return str(min(numlist)) + ' ' + str(max(numlist))
# map을 사용해서 하며 더 짧게 쓸수 있음
# s = list(map(int, s.split()))
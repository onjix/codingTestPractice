def solution(s):
    ar = s.split(' ')
    numlist = [eval(i) for i in ar]
    return str(min(numlist)) + ' ' + str(max(numlist))
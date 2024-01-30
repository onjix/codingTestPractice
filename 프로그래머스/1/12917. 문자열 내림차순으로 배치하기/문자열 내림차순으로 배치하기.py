
def solution(s):
    answer = ''
    str = list(s)
    str.sort(reverse=True)
    answer = ''.join(str)
    
    return answer
def solution(s):
    answer = []
    strs = list(s)
    for i, str in enumerate(strs):
        if i == 0:
            answer.append(-1)
        else:
            if str in strs[:i+1]:
                valueFin = 0
                valueArr = []
                for i in range(len(strs[:i+1])):
                    if str == strs[i]:
                        valueArr.append(i)
                if len(valueArr) > 1:
                    valueFin = valueArr[len(valueArr)-1] - valueArr[len(valueArr)-2]
                    
                if valueFin == 0:
                    answer.append(-1)
                else:
                    answer.append(valueFin)
            
    return answer
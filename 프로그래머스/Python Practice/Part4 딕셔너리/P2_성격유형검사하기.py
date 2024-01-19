def solution(survey, choices):
    answer = ''
    pl = ['R', 'T', 'C', 'F', 'J', 'M', 'A', 'N']
    plnum = [0, 0, 0, 0, 0, 0, 0, 0]
    plscore = [3, 2, 1, 0, 1, 2, 3]
    for i, s in enumerate(survey):
        if choices[i] >= 1 and choices[i] <= 3:
            plnum[pl.index(s[0])] += plscore[choices[i]-1]
        elif choices[i] >= 5 and choices[i] <= 7: 
            plnum[pl.index(s[1])] += plscore[choices[i]-1]
    for i in range(0, 8, 2):
        if plnum[i] == plnum[i+1]:
            answer += pl[i]
        else:
            if plnum[i] > plnum[i+1]:
                num = i
            else:
                num = i+1
            answer += pl[num]
        
    return answer
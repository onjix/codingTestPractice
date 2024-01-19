def solution(wallpaper):
    answer = []
    wallx = []
    wally = []
    x = 0
    for wps in wallpaper:
        y=0
        for wp in wps:
            if wp == "#":
                wallx.append(x)
                wally.append(y)
            y += 1
        x += 1
            
    answer.append(min(wallx))    
    answer.append(min(wally))
    answer.append(max(wallx)+1)
    answer.append(max(wally)+1)
    return answer
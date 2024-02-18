def solution(citations):
    citations.sort(reverse=True)
    sizeControl = []
    for i in range(len(citations)):
        if citations[i] > len(sizeControl):
            pass
        else:
            break
        sizeControl.append(citations[i])
    return len(sizeControl)
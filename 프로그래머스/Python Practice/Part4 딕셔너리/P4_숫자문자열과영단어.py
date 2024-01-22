def solution(s):
    answer = 0
    datas = [["zero", 0], ["one", 1],["two", 2],["three", 3],["four", 4],["five", 5],["six", 6],["seven", 7],["eight", 8],["nine", 9]]
    for data in datas:
        if data[0] in s:
            s = s.replace(data[0], str(data[1]))
    answer = int(s)
    return answer
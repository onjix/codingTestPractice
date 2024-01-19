def solution(id_pw, db):
    answer = 'fail'
    id, pw= id_pw[0], id_pw[1]
    for data in db:
        if id == data[0]:
            answer = 'wrong pw'
            if pw == data[1]:
                answer = 'login'
                break
    return answer
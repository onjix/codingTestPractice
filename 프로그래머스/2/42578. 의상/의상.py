from collections import Counter
def solution(clothes):
    answer = 1
    categorys = []
    # 옷종류가 1개일 때 (a+1) - 1
    # 옷종류가 2개일 때 (a+1)(b+1) - 1
    # 옷종류가 3개일 때 (a+1)(b+1)(c+1) - 1
    for name, category in clothes:
        categorys.append(category)
    cntCategorys = Counter(categorys) 
    
    for cnt in cntCategorys.values():
        answer *= (cnt + 1)
    
    return answer - 1
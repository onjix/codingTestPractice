## 최소공배수, 최대공약수
    최소공배수: 두 수에 서로 공통으로 존재하는 배수 중 가장 작은 수
    최대공약수: 두 수가 서로 공통으로 가지고 있는 약수 중 가장 큰 수 
    코드 예시) a = 6, b = 15
    [최소공배수]
    1)def solution(a, b):
        for i in range(min(a, b), 0, -1):
          if i % a == 0 and i % b == 0:
            return i // i는 a, b의 최소공배수
    2) return math.lcm(a, b) //Pyhon 3.9버전부터 가능
    
    [최대공약수]
    1)def solution(a, b):
        for i in range(max(a, b), a*b)
          if i % a == 0 and i % b == 0:
            return i // i는 a, b의 최대공약수
    2) return math.gcd(a, b)
  

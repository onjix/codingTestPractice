def solution(nums):
    n = set(nums)
    l = len(nums) // 2
    if l > len(n):
        return len(n)
    else:
        return l
def solution(n, words):
    words_set = []
    words_set.append(words[0])
    for i in range(1, len(words)):
        if (words[i] in words_set) or (words_set[i-1][-1] != words[i][0]):
            return [(i%n)+1, (i//n)+1]
        words_set.append(words[i])
    return [0, 0]
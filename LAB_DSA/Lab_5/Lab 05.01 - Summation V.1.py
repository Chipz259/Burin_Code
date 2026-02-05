def summation_loop(n):
    total = 0
    for i in range(1, n + 1):
        total += i
    return total
n = int(input().strip())
print(summation_loop(n))
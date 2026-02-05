def total_digit_presses(n: int) -> int:
    digits_sum = 0
    d = 1
    start = 1

    while start * 10 <= n:
        count = 9 * start
        digits_sum += count * d
        start *= 10
        d += 1

    digits_sum += (n - start + 1) * d

    return digits_sum + n


n = int(input().strip())
print(total_digit_presses(n))

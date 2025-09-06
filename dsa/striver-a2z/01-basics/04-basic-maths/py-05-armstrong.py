def armstrong(num):
    size = 0
    onum = num
    nums = []

    while num > 0:
        size += 1
        nums.append(num % 10)
        num = num // 10
    sum_of_pow = 0

    for i in nums:
        sum_of_pow += i ** size

    return sum_of_pow == onum

print(armstrong(153))
print(armstrong(371))
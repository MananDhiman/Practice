def count_digits(num):
    count = 0
    while num > 0:
        count += 1
        num = num // 10

    return count


arr = [0, 1, 10, 9999]

for i in arr:
    print(count_digits(i))

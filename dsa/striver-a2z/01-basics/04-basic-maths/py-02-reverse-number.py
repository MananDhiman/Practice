def reverse(num):
    sub = False

    if num < 0:
        sub = True
        num = 0 - num

    rev = 0
    while num > 0:
        rev = (rev * 10) + (num % 10)
        num = num // 10

    if sub:
        rev = 0 - rev

    minn = 0 - 2 ** 31
    maxx = 2 ** 31 - 1
    if rev > maxx or rev < minn:
        return 0
    return rev

arr = [0, 1, 10, 9999, -321, 1563847412]
for i in arr:
    print(reverse(i))
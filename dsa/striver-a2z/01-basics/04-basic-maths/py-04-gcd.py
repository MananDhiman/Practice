def gcd(a, b):
    # m = min(a, b)
    # for i in range(m, 0, -1):
    #     if a % i == 0 and b % i == 0:
    #         return i

    # return 1
    if b != 0:
        return gcd(b, a % b)
    else:
        return a


print(gcd(4, 6))
print(gcd(9, 8))

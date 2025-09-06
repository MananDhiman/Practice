def prime(n):
    if n == 1:
        return False
    if n <= 3:
        return True

    for i in range(2, 1+n//2):
        if n % i == 0:
            return False

    return True


print(prime(2))
print(prime(7))
print(prime(9))
print(prime(10))

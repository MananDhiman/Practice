def divs(n):
    ls = []
    for i in range(1, 1+n//2):
        if n % i == 0:
            ls.append(i)
    ls.append(n)
    return ls

print(divs(36))
print(divs(12))
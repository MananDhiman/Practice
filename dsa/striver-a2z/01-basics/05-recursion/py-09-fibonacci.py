def sum_fib(n):
    if n <= 1:
        return n

    return sum_fib(n-1) + sum_fib(n-2)

print(sum_fib(2))
print(sum_fib(3))
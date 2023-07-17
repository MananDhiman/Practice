'''
Write a python function to find out whether a number is divisible by the sum of its digits. If so return True,else return False.
'''

def divisible_by_sum(number):
    sum_digits = 0
    num = number
    
    while num > 0:
        sum_digits += num % 10
        num //= 10
    
    if number % sum_digits == 0:
        return True
    
    return False
    
number=42
print(divisible_by_sum(number))
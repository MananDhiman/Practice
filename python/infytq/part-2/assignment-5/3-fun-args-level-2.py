'''
Write a python function, check_double(number) which accepts a whole number and returns True if it satisfies the given conditions.

The number and its double should have exactly the same number of digits.

Both the numbers should have the same digits ,but in different order.

Otherwise it should return False.

Example: If the number is 125874 and its double, 251748, contain exactly the same digits, but in a different order.
'''

def check_double(number):
    sett = set()
    n = number
    while n > 0:
        sett.add(n % 10)
        n //= 10
        
    double_number = number * 2
    n = double_number
    while n > 0:
        if n % 10 not in sett:
            return False
        n //= 10
    
    return True

#Provide different values for number and test your program
print(check_double(125874))
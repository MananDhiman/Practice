'''
Given an integer n, write a python function to return true, if it is possible to represent it as a sum of the squares of two different integers, else return false.
'''

def check_squares(number):
    n = int(number**0.5)
    for i in range(1, n + 1):
        for j in range(i + 1, n + 1):
            if i**2 + j**2 == number:
                return True
            
    return False

number=68
print(check_squares(number))
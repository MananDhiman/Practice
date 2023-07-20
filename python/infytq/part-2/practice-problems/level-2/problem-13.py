'''
Write a python function which accepts three numbers and returns True if

a. one of the three numbers is "close" to any one of the other numbers (differing from a number by at most 1), and

b.Number that is left out is "far", differing from both other values by 2 or more.

Return false if the above mentioned conditions are not satisfied.
'''

def close_number(num1, num2, num3):
    # Helper function to check if two numbers are close
    def is_close(a, b):
        return abs(a - b) <= 1

    # Helper function to check if a number is far from both other numbers
    def is_far(num, other1, other2):
        return abs(num - other1) >= 2 and abs(num - other2) >= 2

    # Check conditions for close and far
    if is_close(num1, num2) and is_far(num3, num1, num2):
        return True
    if is_close(num1, num3) and is_far(num2, num1, num3):
        return True
    if is_close(num2, num3) and is_far(num1, num2, num3):
        return True

    # If no condition is met, return False
    return False

print(close_number(5,4,2))
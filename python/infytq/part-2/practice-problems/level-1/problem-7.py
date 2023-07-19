'''
Given two numbers, write a python function which returns true if first number is a seed of second number.
Otherwise it returns false.

A number X is said to be a seed of number Y, if multiplying X by its each digit equates to Y

For example, 123 is a seed of 738 as 123*1*2*3 = 738.
'''

def get_list_numbers(number):
    list = []
    
    while number > 0:
        list.append(number % 10)
        number //= 10
        
    return list

def seed_no(number,ref_no):
    # mul number by numbers digits equals ref_no
    list = get_list_numbers(number)
    product = number
    for i in list:
        product *= i
        
    if product == ref_no:
        return True
    
    return False
    
number=123
ref_no=738
print(seed_no(number,ref_no))
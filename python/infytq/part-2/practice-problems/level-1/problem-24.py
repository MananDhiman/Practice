'''
Given two positive integers. Write a python function to
return the greatest common divisor of the given numbers.

14 and 35 -> 7
800 and 2800 -> 400
'''

def get_list(number):
    list = []
    
    for i in range(1, number+1):
        if number % i == 0:
            list.append(i)
            
    return list

def find_gcd(num1,num2):
    list1 = get_list(num1)
    list2 = get_list(num2)
    
    max = None
    
    for i in list1:
        if i in list2:
            max = i
            
    return max
    

num1=45
num2=9
print(find_gcd(num1,num2))
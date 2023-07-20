'''
Given a list of numbers, write a python function to exchange the first n/2 elements of a list with the last n/2 elements.
The function should return the new list.

n represents the number of elements in the list. Assume that it will always be even.
'''

def exchange_list(number_list):
    # shift last half to first
    # flip first half to las
    list = []
    n = len(number_list)
    
    for i in number_list:
        list.append(i)
    
    i = 0
    while i < n//2:
        list[n//2 + i] = number_list[i]
        i += 1
    
    l = 0
    r = n - 1
    
    while l < r:
        list[l] = number_list[r]
        l += 1
        r -= 1
    
    return list
     
number_list=[1,2,3,4,5,6]
print(exchange_list(number_list))
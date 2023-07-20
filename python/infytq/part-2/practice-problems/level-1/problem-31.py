'''
Given a list of integers and a number. Write a python function to find and return the sum of the elements of the list. 
Note: Don't add the given number and also the numbers present before and after the given number in the list.
'''

def sum_of_elements(num_list,number):
    sum = 0
    for i in range(1, len(num_list) - 1):
        if num_list[i] == number or num_list[i+1] == number or num_list[i-1] == number:
            continue
        sum += num_list[i]

    if num_list[1] != number and num_list[0] != number:
        sum += num_list[0]

    if num_list[len(num_list) - 2] != number and num_list[len(num_list) - 1] != number:
        sum += num_list[len(num_list) - 1]
    
    return sum
      
num_list=[2, 3, 4, 5, 6, 2, 3]
number=2
print(sum_of_elements(num_list, number))

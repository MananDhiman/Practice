'''
Consider sample data as follows: sample_data=range(1,11)

Create two functions: odd() and even()
The function even() returns a list of all the even numbers from sample_data
The function odd() returns a list of all the odd numbers from sample_data

Create a function sum_of_numbers() which will accept the sample data and/or a function.
If a function is not passed, the sum_of_numbers() should return the sum of all the numbers from sample_data
If a function is passed, the sum_of_numbers() should return the sum of numbers returned from the function passed.
'''

#This verification is based on string match.

def sum_of_numbers(list_of_num,filter_func=None):
    #Remove pass and write the logic here
    if filter_func == None:
        return sum(list_of_num)
    else:
        return sum(filter_func(list_of_num))

def even(data):
    list1 = []#Remove pass and write the logic here
    for i in data:
        if i % 2 == 0:
            list1.append(i)
    return list1

def odd(data):
    #Remove pass and write the logic here
    list2 = []#Remove pass and write the logic here
    for i in data:
        if i % 2 != 0:
            list2.append(i)
    return list2

sample_data = range(1,11)

print(sum_of_numbers(sample_data,odd(sample_data)))
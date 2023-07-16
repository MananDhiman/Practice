'''
A 10-substring of a number is a substring of its digits that sum up to 10.

For example, the 10-substrings of the number 3523014 are:
'352', '523', '5230', '23014'

Write a python function, find_ten_substring(num_str) which accepts a string and returns the list of 10-substrings of that string.
'''

# converts number as string to list of each digit of number as string
def num_str_to_list(num_str):
    num_str = int(num_str)
    list = []
    while num_str > 0:
        list.append(num_str % 10)
        num_str //= 10
    
    list.reverse()
    return list
    
# accepts list of each digit of number as string and generates all possible subarrays
def generate_all_subarrays(num_list):
    list = []
    
    i = 0
    while i < len(num_list):
        j = i
        while j < len(num_list):
            ls = []
            it = i
            while it <= j:
                ls.append(num_list[it])
                it += 1
            list.append(ls)
            j += 1
        i += 1

    return list
    
# from all possible subarrays, selects those with sum 10
def get_subarray_with_sum_ten(subarray_list):
    list = []

    for i in subarray_list:
        sum = 0
        for j in i:
            sum += j
        if sum == 10:
            list.append(i)

    return list

# converts subarray to a string
def convert_subarray_to_string_num(subarray_sum_ten):
    list = []
    for i in subarray_sum_ten:
        stri = ""
        for j in i:
            stri += str(j)
        list.append(stri)

    return list
            
# accepts a number as string and returns the list of substring whose digits sum up to 10
def find_ten_substring(num_str):
    num_list = num_str_to_list(num_str)
    
    subarray_list = generate_all_subarrays(num_list)

    subarray_sum_ten = get_subarray_with_sum_ten(subarray_list)
    list = convert_subarray_to_string_num(subarray_sum_ten)
    return list

num_str="2825302"
print("The number is:",num_str)
result_list=find_ten_substring(num_str)
print(result_list)
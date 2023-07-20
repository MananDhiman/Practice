'''
Write a Python function to rotate the list of elements by N positions. The function should return the rotated list.

Note : Assume that number of positions to be rotated is always a value >= 0 and <= length of the input list. 
'''
def rotate_list(input_list, n):
    # Slice the list and concatenate the two parts in the rotated order
    output_list = input_list[-n:] + input_list[:-n]

    return output_list

input_list= [1,2,3,4,5,6]
output_list=rotate_list(input_list,4)
print(output_list)
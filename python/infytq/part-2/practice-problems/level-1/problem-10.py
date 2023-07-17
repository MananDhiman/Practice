'''
Write a Python function which accepts a string and returns a string made of the first 2 and the last 2 characters of the given string.

If the string length is less than 2, return -1.

Note: If the string length is equal to 2, consider the 2 characters to be the first as well as the last two characters.
'''

def string_both_ends(input_string):
    if len(input_string) < 2:
        return -1
	
    else:
        first = input_string[0:2] 
        last =  input_string[-2:]
        sum = first + last
        return sum
	  

input_string="w3w"
print(string_both_ends(input_string))
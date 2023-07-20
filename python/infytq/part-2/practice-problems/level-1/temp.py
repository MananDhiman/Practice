'''Write a python function which accepts three numbers and returns True if

a. one of the three numbers is "close" to any one of the other numbers (differing from a number by at most 1), and
b.Number that is left out is "far", differing from both other values by 2 or more.

Sample Input
i) 4,1,3
ii) 5,6,7

Expected Output
i) True
ii)False
'''



def close_number(num1,num2,num3):
    two_num_close = check_two_num_close(num1,num2,num3)
    
    left_num_far = check_left_num_far(num1,num2,num3)
    
print(close_number(5,4,2))
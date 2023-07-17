'''
Write a python function which accepts a list of numbers and returns true if the list contains a 2 next to a 2. Otherwise it should return false.
'''

def check_22(num_list):
    for i in range(0, len(num_list)-1):
        if num_list[i] == 2 and num_list[i+1] == 2:
            return True
        
    return False
    
print(check_22([3,2,5,1,2,1,2,2]))
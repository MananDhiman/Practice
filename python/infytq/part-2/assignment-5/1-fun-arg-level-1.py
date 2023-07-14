'''
Write a python function, find_pairs_of_numbers() which accepts a list of positive integers with no repetitions,
and returns count of pairs of numbers in the list that adds up to n.
The function should return 0, if no such pairs are found in the list.
'''

def find_pairs_of_numbers(num_list,n):
    count = i = 0
    
    while i < len(num_list):
        j = 0
        while (j < len(num_list)):
            if j == i:
                j += 1
                continue

            if num_list[i] + num_list[j] == n:
                count += 1
            
            j += 1
        
        i += 1
    
    return count // 2
    
    

num_list=[1, 2, 4, 5, 6]
n=7
print(find_pairs_of_numbers(num_list,n))
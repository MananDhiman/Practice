'''
A Ducci sequence is a sequence of lists of integers. Given a starting list of integers, the next list in the sequence is formed
by taking the absolute differences of neighboring integers in the previous list.

Start List: [0,653,1854,4063]
Ducci Sequence:[653,1201,2209,4063], [548,1008,1854,3410], ...........,[0,0,0,0]

Assumption: The Ducci sequence ends with a list containing 0s and the starting list contains four elements.

Write a python function that takes a starting list of integers and a number ‘n’ as input, and returns the nth element of the Ducci sequence.

Sample Input
test_list=[0,653,1854,4063]
n = 1

Expected Output
[548,1008,1854,3410]
'''

def ducci_sequence(test_list,n):
    list = []

    for i in test_list:
        list.append(i)

    for i in range(n+1):        
        list[0] = abs(test_list[1] - test_list[0])
        list[1] = abs(test_list[2] - test_list[1])
        list[2] = abs(test_list[3] - test_list[2])
        list[3] = abs(test_list[3] - test_list[0])
        
        test_list.clear();
        for i in list:
            test_list.append(i)

    
    return list

ducci_element=ducci_sequence([2, 55, 856, 3065] , 4)
print(ducci_element)
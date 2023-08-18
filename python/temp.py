
#lex_auth_0127136216235950081185
import math
def ducci_sequence(test_list,n):
    list = []

    for i in test_list:
        list.append(i)

    for i in range(n+1):        
        list[0] = abs(test_list[1] - test_list[0])
        list[1] = abs(test_list[2] - test_list[1])
        list[2] = abs(test_list[3] - test_list[2])
        list[3] = abs(test_list[3] - test_list[0])
        print(i, list)
        
        test_list.clear();
        for i in list:
            test_list.append(i)

    
    return list

ducci_element=ducci_sequence([2, 55, 856, 3065] , 4)
print(ducci_element)
'''
Write a python function find_duplicates(), which accepts a list of numbers
and returns another list containing all the duplicate values in the input list
and the order should be same as in the input list.
If there are no duplicate values, it should return an empty list.
'''
#lex_auth_01269443477535129681

def find_duplicates(list_of_numbers):
    sett = set()
    sett_duplicates = set()
    
    for i in list_of_numbers:
        if i in sett:
            sett_duplicates.add(i)
        else:
            sett.add(i)
    
    
    return list(sett_duplicates)

list_of_numbers=[1,2,2,3,3,3,4,4,4,4]
list_of_duplicates=find_duplicates(list_of_numbers)
print(list_of_duplicates)
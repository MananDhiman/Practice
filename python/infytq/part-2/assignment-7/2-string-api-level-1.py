'''
Write a python function, remove_duplicates() which accepts a string and removes all duplicate characters from the given string and return it.
'''

def remove_duplicates(value):
    sett = set()
    
    for i in value:
        sett.add(i)
        
    answer = ""
    
    for i in value:
        if i in sett:
            answer += i
            sett.remove(i)
        
        
    return answer

print(remove_duplicates("11223445566666ababzzz@@@123#*#*"))
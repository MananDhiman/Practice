'''
Given a string, write a python function to return True if the strings "mat" and "jet" appear the same number of times in the given string, else return False.

Note: Perform case insensitive string comparison wherever necessary.
'''

def check_occurence(string):
    string = string.lower()
    string_list = string.split(" ")
    
    if string_list.count('mat') == string_list.count('jet'):
        return True
   
    return False
        
string="Jet on the Mat but mat is too long"
print(check_occurence(string))
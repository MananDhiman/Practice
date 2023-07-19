'''
Write a python function that accepts a list of words and returns the list of integers representing the length of the corresponding words.
'''

def list_of_count(word_list):
    list = []
    for i in word_list:
        list.append(len(i))
    
    
    return list

word_list=["COme","here"]
print(list_of_count(word_list))
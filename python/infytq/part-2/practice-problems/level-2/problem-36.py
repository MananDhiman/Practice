'''
Part-1:
Write a python function which accepts a string of words and a target word,
and returns the list of the positions of the target word in the string of words.

Part-2:
Write a python function which accepts a string of words and returns a dict which contains the words
in the input string as key and the list of positions of these words in the input string as value. Use the function written in part-1.

Note:
1.The words are separated by a single space.
2.There are no punctuation marks or upper case letters.
'''

def find_target_positions(input_string, target_word):
    target_list=[]
    ls = input_string.split(" ")
    
    for i in range(len(ls)):
        if ls[i] == target_word:
            target_list.append(i)

    return target_list

def find_inverted_index(input_string):
    target_dict={}
    ls = input_string.split(" ")
    for i in ls:
        target_dict[i] = find_target_positions(input_string, i)
    
    return target_dict
    
    
input_string="we dont need no education we dont need no thought control no we dont"
result_dict=find_inverted_index(input_string)
print(result_dict)
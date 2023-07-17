'''
Write a python function, check_anagram() which accepts two strings
and returns True, if one string is a special anagram of another string.
Otherwise returns False.

The two strings are considered to be a special anagram if they contain repeating characters
but none of the characters repeat at the same position. The length of the strings should be the same.

eat, tea -> True
backward,drawback -> False 
'''

def check_anagram(data1,data2):
    
    word1=[]
    word2=[]
    
    for i in data1.lower():
        word1.append(i)
    for i in data2.lower():
        word2.append(i)
    
    count_common_characters = 0
    
    if len(data1)==len(data2):
        for i in range(0,len(data1)):
            if l1[i] in l2 and l1[i]!=l2[i]:
                count_common_characters += 1 
    else:
        return False
        
    if len(data1)==count_common_characters:
        return True
    else:
        return False

print(check_anagram("eat","tea"))
'''
Write a recursive function, is_palindrome() to find out whether a string is a palindrome or not.
The function should return true, if it is a palindrome. Else it should return false. 

Note- Perform case insensitive operations wherever necessary.
'''

def is_palindrome(word, i = 0):
    if word == "":
        return true
        
    l = i
    r = len(word) - i - 1
    
    if l >= r:
        return True
    
    if (word[l].lower() == word[r].lower()) and is_palindrome(word, i+1):
        return True
    
    return False
    
    
result=is_palindrome("MadAMa")

if(result):
    print("The given word is a Palindrome")
else:
    print("The given word is not a Palindrome")
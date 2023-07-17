'''
Write a python function which accepts a sentence and returns a list
in which first value is the count of upper case letters and second value is the count of lower case letters
in the sentence. Ignore spaces, numbers and other special characters if any.
'''

#lex_auth_0127136021907046401165

def find_upper_and_lower(sentence):
  list = [0,0]
    
  for i in sentence:
    if ord(i) >= 65 and ord(i) <= 90:
      list[0] += 1
    elif ord(i) >= 97 and ord(i) <= 122:
      list[1] += 1
      
  return list
       
    

sentence="Come Here"
print(find_upper_and_lower(sentence))
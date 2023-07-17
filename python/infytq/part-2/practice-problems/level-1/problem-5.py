'''
Write a python function which accepts a sentence and finds the number of letters and digits in the sentence.

It should return a list in which the first value should be letter count and second value should be digit count.
Ignore the spaces or any other special character in the sentence.
'''

def count_digits_letters(sentence):
    result_list = [0,0]
    for i in sentence:
        if (ord(i) >= 65 and ord(i) <= 90) or (ord(i) >= 97 and ord(i) <= 122):
            result_list[0] += 1
        elif (ord(i) >= 48 and ord(i) <= 57):
            result_list[1] += 1
            
    return result_list

sentence="Infosys Mysore 570027"
print(count_digits_letters(sentence))
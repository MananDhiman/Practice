'''A teacher is in the process of generating few reports based on the marks scored by the students of her class in a project based assessment.
Assume that the marks of her 10 students are available in a tuple. The marks are out of 25.

Write a python program to implement the following functions:

1. find_more_than_average(): Find and return the percentage of students who have scored more than the average mark of the class.

2. generate_frequency(): Find how many students have scored the same marks. For example, how many have scored 0, how many have scored 1, how many have scored 3….how many have scored 25. The result should be populated in a list and returned.

3. sort_marks(): Sort the marks in the increasing order from 0 to 25. The sorted values should be populated in a list and returned.'''

#Global variable
list_of_marks=(12,18,25,24,2,5,18,20,20,21)

def find_more_than_average():
    global list_of_marks
    sum = 0
    for i in list_of_marks:
        sum += i
        
    average = sum / 10
    
    count = 0
    for i in list_of_marks:
        if i > average:
            count += 1
            
    return count * 10
    

def sort_marks():
    global list_of_marks
    return sorted(list_of_marks)
    

def generate_frequency():
    global list_of_marks
    dict = {}
    for i in list_of_marks:
        if i in dict:
            freq = dict[i]
            dict[i] = freq + 1
            
        else:
            dict[i] = 1
    
    ans = []

    for i in range(26):
        if i in dict:
            ans.append(dict[i])
        else:
            ans.append(0)
    
    return ans

print(find_more_than_average())
print(generate_frequency())
print(sort_marks())
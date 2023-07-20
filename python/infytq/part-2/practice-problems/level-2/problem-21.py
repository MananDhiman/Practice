'''
Tom is working in a shop where he labels items. Each item is labelled with a number between num1 and num2(both inclusive). Since Tom is also a natural mathematician, he likes to observe patterns in numbers. Tom could observe that some of these label numbers are divisible by other label numbers.

Write a Python function to find out those label numbers that are divisible by another label number and display how many such label numbers are there totally.

Note:- Consider only the distinct label numbers. The list of those label numbers should be considered as a set.
'''

def check_numbers(num1, num2):
    def is_divisible(num, divisor):
        return num % divisor == 0

    distinct_labels = set()

    for label in range(num1, num2 + 1):
        for other_label in range(num1, num2 + 1):
            if label != other_label and is_divisible(label, other_label):
                distinct_labels.add(label)

    return [distinct_labels,len(distinct_labels)]
    

num1=2
num2=20
print(check_numbers(num1, num2))

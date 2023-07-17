'''
Write a Python function which generates and returns a dictionary
where the keys are numbers between 1 and n (both inclusive) and the values are square of keys.
'''

def generate_dict(number):
	new_dict = {}
	
	for i in range(1,number+1):
	  new_dict[i] = i*i
	  
	return new_dict

number=20
print(generate_dict(number))
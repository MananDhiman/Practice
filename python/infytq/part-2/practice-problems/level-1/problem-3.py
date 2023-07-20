'''
Write a python function to create and return a new dictionary from the given dictionary(item:price).
Given the following input, create a new dictionary with elements having price more than 200.

Sample Input:
prices = { 'ACME': 45.23,'AAPL': 612.78, 'IBM': 205.55,'HPQ': 37.20,'FB': 10.75}

Expected Output
{'AAPL': 612.78, 'IBM': 205.55}
'''

def create_new_dictionary(prices):
    dict = {}
    for i in prices:
        if prices[i] > 200:
            dict[i] = prices[i]

    return dict

prices = { 'ACME': 45.23,'AAPL': 612.78,'IBM': 205.55,'HPQ': 37.20,'FB': 10.75}
print(create_new_dictionary(prices))
'''
Write a python function which accepts any number in the range of 1 to 4999 (both inclusive) and returns the equivalent roman numeral of it.
'''

def convert_to_roman(num):
    val = [
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4,
        1
    ]

    syb = [
        "M", "CM", "D", "CD",
        "C", "XC","L", "XL",
        "X", "IX","V", "IV",
        "I"
    ]

    roman_num = ""
    i = 0

    while num > 0:
        for _ in range(num // val[i]):
            roman_num += syb[i]
            num -= val[i]
        i += 1
    
    return roman_num


for num in range(1,5000):    
    print(num," : ",convert_to_roman(num))
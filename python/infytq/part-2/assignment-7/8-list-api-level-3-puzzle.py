'''
Use Luhn algorithm to validate a credit card number.

A credit card number has 16 digits, the last digit being the check digit. A credit card number can be validated using Luhn algorithm as follows:

Step 1a: From the second last digit (inclusive), double the value of every second digit.
Suppose the credit card number is 1456734512345698.
Take the double of 9,5,3,1,4,7,5 and 1
i.e., 18, 10, 6, 2, 8, 14, 10 and 2
'''
def validate_credit_card_number(card_number):
    #start writing your code here
    card=str(card_number)
    l=[]
    if len(card)==16:
        for i in card[-2::-2]:
            n=int(i)*2
            if n>9:
                n1=n%10+n//10
                l.append(n1)
            else:
                l.append(n)
        return (sum(l)+sum(list(map(int,card[-1::-2]))))%10==0
    else:
        return False

card_number= 5239512608615007
result=validate_credit_card_number(card_number)
if(result):
    print("credit card number is valid")
else:
    print("credit card number is invalid")
'''
Write a python program to validate the details provided by a user as part of registering to a web application.

Write a function validate_name(name) to validate the user name
    Name should not be empty, name should not exceed 15 characters
    Name should contain only alphabets

Write a function validate_phone_no(phoneno) to validate the phone number
    Phone number should have 10 digits
    Phone number should not have any characters or special characters
    All the digits of the phone number should not be same.
    Example: 9999999999 is not a valid phone number

Write a function validate_email_id(email_id) to validate email Id
    It should contain one '@' character and '.com'
    '.com' should be present at the end of the email id.
    Domain name should be either 'gmail', 'yahoo' or 'hotmail'
Note: Consider the format of email id to be username@domain_name.com

All the functions should return true if the corresponding value is valid. Otherwise, it should return false
'''

import re 
def validate_name(name):
    #Start writing your code here
    if 0<len(name)<16:
        if str.isalpha(name):
            return True
    return False
    
def validate_phone_no(phno):
    #Start writing your code here
    if len(phno)==10:
        if str.isdigit(phno):
            for i in phno:
                if phno.count(i)!=10:
                    return True
    return False

def validate_email_id(email_id):
    #Start writing your code here
    if re.search('@gmail.com$|@yahoo.com$|@hotmail.com$',email_id)!=None:
        if email_id.count('@')==1 and email_id.count('.com')==1:
            return True
    return False
def validate_all(name,phone_no,email_id):
    #Start writing your code here
    # Use the below given print statements to display appropriate messages
    # Also, do not modify them for verification to work
    if not validate_name(name):
        print("Invalid Name")
    if not validate_phone_no(phone_no):
        print("Invalid phone number")
    if not validate_email_id(email_id):
        print("Invalid email id")
    if validate_name(name) and validate_phone_no(phone_no) and validate_email_id(email_id):
        print("All the details are valid")


#Provide different values for name, phone_no and email_id and test your program
validate_all("Tina", "9994599998", "tina@yahoo.com")
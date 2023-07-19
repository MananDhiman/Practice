#lex_auth_0127136213490565121191

def get_list(number):
    list = []
    
    for i in range(1, number-1):
        if number % i == 0:
            list.append(i)
            
    return list

def find_gcd(num1,num2):
    list1 = get_list(num1)
    list2 = get_list(num2)

    max = None
    
    for i in list1:
        print("Number to check", i)
        if i in list2:
            print("Number ",i," exists in l2")
            max = i
            print("max assigned")
    

num1=45
num2=9
print(find_gcd(num1,num2))

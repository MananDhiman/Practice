def isPalindrome(s) -> bool:
    if len(s) <= 1:
        return True

    s = s.lower()
    
    new_s = ""
    for i in s:
        if i == " " or i > 'z' or i < 'a' or i < '0' or i > '9':
            continue
        new_s += i
    print(new_s)    
    return new_s == new_s[::-1]


print(isPalindrome("A man, a plan, a canal: Panama"))

def is_pal(st, i=0):
    if len(st) <= 1:
        return True
    
    return st == st[::-1]

# print(is_pal("hannah"))
# print(is_pal("aabbaaa"))

x = "0P"
x = x.lower()
print(x)


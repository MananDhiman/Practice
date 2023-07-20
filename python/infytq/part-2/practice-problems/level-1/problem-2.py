'''
Write a python function which accepts a string containing a pattern of brackets and returns true if the pattern of brackets is correct.
Otherwise it returns false.

The string of brackets is correct if it satisfies the following conditions:
1. Number of opening and closing brackets are equal.
2. Pattern should not start with closing bracket and end with opening bracket.
'''
def bracket_pattern(input_str):
    if input_str[0] == ")" or input_str[len(input_str)-1] == "(":
        return False
        
    ls = []
    for i in input_str:
        if i == "(":
            ls.append(i)
        else:
            try:
                if ls.pop() != "(":
                    return False
            except:
                return False

    if len(ls) == 0:
        return True
    
    return False

    
input_str="(())"
print(bracket_pattern(input_str))
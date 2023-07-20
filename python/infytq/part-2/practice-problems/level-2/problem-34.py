'''
Write a recursive python function which returns True if the input is well-formatted with respect to the list labels. Else it should return False.

We say that an input is well-formatted with respect to the labels if:
(a) input item is a list 
(b) input item has length at least two 
(c) input’s first item is in the list labels 
(d) each of the remaining items in input is either a string or a well-formatted list 
'''

def check_well_formatted(input_item,list_label):
    if not isinstance(input_item, list):
        return False

    if len(input_item) < 2:
        return False

    if input_item[0] not in list_label:
        return False

    for item in input_item[1:]:
        if not (isinstance(item, str) or check_well_formatted(item, list_label)):
            return False

    return True


input_list1=['VP', ['V', 'eat']]
list_label1=['VP', 'V']
result=check_well_formatted(input_list1,list_label1)
if result is True:
    print("Well formatted")
else:
    print("Not Well formatted")
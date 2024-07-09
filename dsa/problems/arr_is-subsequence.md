base case: substring start and end are same, len of s is 1
get first element s1 of s, check if s1 exists in t | if false, return false

get second element s2 of s, check if s2 exists in t where indexOf(s2) > indexOf(s1)

keep repeating for all elements of s

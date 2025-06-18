ls = [0,2,3,4,6,8,9]
ans = []
start = 0
while start < len(ls):
    prev = start
    r = start+1
    if r == len(ls):
        ans.append(str(ls[r-1]))
        break
    while r < len(ls) and ls[r] - ls[prev] == 1:
        r+=1
        prev+=1

    if r-1 == start:
        ans.append(str(ls[r-1]))
    else:
        ans.append(str(ls[start])+ "->"+ str(ls[r-1]))

    start = r

print(ans)

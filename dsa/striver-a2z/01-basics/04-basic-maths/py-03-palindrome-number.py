def palind_number(num):
	if num < 0:
		return False

	onum = num
	rev = 0
	while num > 0:
		rev = (rev * 10) + (num % 10)
		num = num // 10

	return rev == onum

arr = [121, -121, 10]
for i in arr:
	print(palind_number(i))
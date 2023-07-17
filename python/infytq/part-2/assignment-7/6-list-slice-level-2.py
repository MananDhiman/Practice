'''
The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

Write a python program to find and display the number of circular primes less than the given limit.
'''
def check_prime(number):
    factor = 2
    while factor * factor <= int(number):
        if int(number) % factor == 0:
            return False
        factor+=1
    return True

def rotations(num):
    answer = []
    final=[]
    rotation = str(num)
    while not rotation in answer:
        answer.append(rotation)
        rotation = rotation[1:] + rotation[0]
    for i in answer:
        final.append(int(i))
    return final


def get_circular_prime_count(limit):
    all_circulations = [2]
    ret = []
    for num in range(3, limit, 2):
        if check_prime(num):
            check = 0
            if rotations(num):
                circulations = rotations(num)
                for circulation in circulations:
                    if not check_prime(circulation):
                        check += 1
                if not check:
                    all_circulations.extend(circulations)
    final = sorted(list(set(all_circulations))) 
    for i in final:
        if i<=limit:
            ret.append(i)
    return len(ret)
    
print(get_circular_prime_count(20))
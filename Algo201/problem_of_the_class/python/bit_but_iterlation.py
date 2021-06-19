def d_to_b(num,n):
    bi = [] 
    while num > 0 :
        bi.append(num%2)
        num = num//2

    while len(bi) < n:
        bi.append(0)

    return bi

def print_bit(bi):
    for i in bi[::-1] :
        print(i,end=' ')

n = int(input())

for i in range(2**n) :
    print_bit(d_to_b(i,n))
    print()
def print_bit(arr):
    for i in arr :
        print(i,end=' ')
    print()

def gen_bit(n,arr,i):
    if n == i :
        print_bit(arr)
        return 

    arr[i] = 0 
    gen_bit(n,arr,i+1)
 
    arr[i] = 1 
    gen_bit(n,arr,i+1) 

t = int(input("input:"))
arr = []

for i in range(t):
    arr.append(0)

print("output:")
gen_bit(t,arr,0)
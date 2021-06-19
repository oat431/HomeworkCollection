def bee_each_year(n):
    if n == 0 :
        return 2
    if n == 1 :
        return 4
    return bee_each_year(n-2) + bee_each_year(n-1) + 1

print("input:")
n = int(input())
print("output")
print(bee_each_year(n))





def fill_tile(n):
    if n == 0 or n == 1 or n == 2: 
        return 1
    return fill_tile(n-1) + fill_tile(n-2) + fill_tile(n-3)
print(fill_tile(8))

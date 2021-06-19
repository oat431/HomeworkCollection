def coinChange(coin,m,n):
    if n == 0 :
        print() 
        return 1
    
    print(coin[m-1],end=' ')
    if n < 0 :
        return 0
    
    if m <= 0 and n>=1 :
        return 0
    return coinChange(coin,m-1,n) + coinChange(coin,m,n-coin[m-1])

coin = [1,2,3]
m = len(coin)
n = 4;

coinChange(coin,m,n)


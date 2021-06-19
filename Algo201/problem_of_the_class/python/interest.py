def interestIter(n,money):
    for i in range(5) :
        money = money + ((8/100) * money)
    return money

def interestEndOfYear(n,money):

money = 1000
n = 5
print(interestIter(n,money))
print(money * (1.08**n))

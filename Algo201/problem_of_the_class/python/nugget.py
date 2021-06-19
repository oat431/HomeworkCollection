nugget = [(False) for i in range(100)]

nugget[6] = True
nugget[9] = True
nugget[12] = True

for i in range(13,100):
    if nugget[i-6] == True or nugget[i-9] == True or nugget[i-12] == True :
        nugget[i] = True

n = int(input())
cnt = 0
for i in range(n):
    if nugget[i] :
        print(i)
        cnt += 1

if cnt == 0 :
    print("no")


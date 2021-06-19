print("input:")
Arr = input().split(",")
S = int(input())
N = int(input())
print("output:")
cnt = 0
for i in range(len(Arr)):
    if i + N - 1 == len(Arr) :
        break
    Sum = 0
    for j in range(i,i + N):
        Sum += int(Arr[j])
    if Sum == S :
        cnt += 1

print(cnt)


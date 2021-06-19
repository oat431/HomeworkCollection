def read():
    mat = "" 
    while True:
        word = input()
        if len(word) == 0 :
            mat += ","
        else:
            mat += word
            if word[-1] == ']' :
                break
    
    mat = mat.replace('[' , "")
    mat = mat.replace(']' , "")
    matrix = []
    li = mat.split(",")
    for i in li :
        row = i.split()
        matrix.append(row)
    
    return matrix

print("input:")
mat = read()

n = len(mat)
m = len(mat[0])

for i in range(n):
    for j in range(m//2):
        mat[i][j],mat[i][m-j-1] = mat[i][m-j-1],mat[i][j]

print("output:")
for i in range(n):
    for j in range(m):
        print(mat[i][j],end=' ')
    print()
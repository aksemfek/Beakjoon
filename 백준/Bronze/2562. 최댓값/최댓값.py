b=[]
for i in range(0,9):
    b.append(int(input()))
max =0
for i in range(0,9):
    if(max < b[i]):
        max = b[i]
        count =i+1
print(max, count)
a = int(input())
b = list(map(int, input().split()))
max =-1000000
min = 1000000
for i in range(0,a):
    if(max<b[i]):
        max = b[i]
    if(min>b[i]):
        min = b[i]
print(min, max)
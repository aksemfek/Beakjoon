a = int(input())
count=0
b = list(map(int, input().split()))
c = int(input())
for i in range(0,a,1):
    if(b[i] == c):
        count += 1
print(count)
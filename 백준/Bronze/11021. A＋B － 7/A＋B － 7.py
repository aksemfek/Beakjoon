a = int(input())
sum = []
count = []
for i in range(0,a,1):
    b,c = map(int, input().split()) 
    sum.append(b+c)
    count.append(i+1)


for i,sum in zip(count,sum):
    print("Case #",i,': ', sum, sep='')
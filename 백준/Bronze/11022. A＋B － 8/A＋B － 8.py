a = int(input())
sum = []
count = []
b1= []
c1 = []
for i in range(0,a,1):
    b,c = map(int, input().split()) 
    b1.append(b)
    c1.append(c)
    sum.append(b+c)
    count.append(i+1)


for i,sum,b1,c1 in zip(count,sum,b1,c1):
    print("Case #",i,': ',b1,' + ',c1,' = ', sum, sep='')
a=int(input())
b=int(input())
sum = 0
for i in range(0,b,1):
    b, d = map(int,input().split())
    f= b * d
    sum+=f
if(a == sum):
    print('Yes')
else:
    print('No')
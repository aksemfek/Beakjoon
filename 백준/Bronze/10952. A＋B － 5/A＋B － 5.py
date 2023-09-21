sum = []
while True:
    a,b = map(int, input().split())
    if( a==0 and b==0):
        break;
    sum.append(a+b)
for sum in sum:
    print(sum)
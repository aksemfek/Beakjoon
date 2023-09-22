num1, num2 = map(int,input().split())
a = []
for i in range (1, num1+1):
    a.append(int(i))
for i in range(0, num2):
    num3 ,num4 = map(int, input().split())
    temp = a[num3-1]
    a[num3-1] = a[num4-1]
    a[num4-1] = temp
for a in a:
    print(a, end=' ')
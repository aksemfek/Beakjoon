h, m = map(int, input().split())
t = int(input())
if(m+t>60):
    x = (m+t)%60
    y = (m+t)//60
    h = h+y
    if(h>23):
        h = h-24
        print(h, x)
    else:
        print(h, x)
elif(m+t==60):
    x = (m+t)%60
    y = (m+t)//60
    h = h+y
    if(h>23):
        h = h-24
        print(h, x)
    else:
        print(h, x)
else: 
    print(h, m+t)

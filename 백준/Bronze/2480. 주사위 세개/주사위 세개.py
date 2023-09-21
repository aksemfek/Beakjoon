a, b, c = map(int,input().split())
x = 10000
y= 1000
if(a==b==c):
    print(x+a*1000)
elif(a==b or a==c):
    print(y+a*100)
elif(b==c):
    print(y+b*100)
elif(a>b and a>c):
    print(a*100)
elif(a<b and c<b):
    print(b*100)
else:
    print(c*100)
a=int(input())
for i in range(a):
    b=""
    for j in range(a-i-1):
        b=b+" "
    for k in range(i+1):
        b=b+"*"
    print(b)
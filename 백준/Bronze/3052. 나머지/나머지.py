a=[]
for i in range(0,10):
    a.append(int(input()))
b=[]
count=0
for i in range(0,10):
    b.append(a[i]%42)
result = dict.fromkeys(b)
for result in result:
    count+=1
print(count)
a= []
b= []
for i in range(1,31):
    a.append(int(i))
for i in range(0,28):
    b.append(int(input()))
b.sort()
c = set(a)- set(b)
d = list(c)
d.sort()
print(d[0])
print(d[1])
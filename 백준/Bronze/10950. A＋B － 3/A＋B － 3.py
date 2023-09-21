a = int(input())
sum = []
for i in range(0,a,1):
    b,c = map(int, input().split()) 
    sum.append(b+c)
    
for sum in sum:
    print(sum)
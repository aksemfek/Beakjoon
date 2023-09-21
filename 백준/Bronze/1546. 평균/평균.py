a=int(input())
score= list(map(int,input().split()))
sum=0
max=0
for i in range(0,a):
    if(max < score[i]):
        max = score[i]
for i in range(0,a):
    sum = sum + score[i]/max*100
print(sum/a)
h, m = map(int, input().split())
if(0< h <24 and m<45):
    h = h-1
    m = 60 -(45- m)
    print(h,  m)
elif(h <24 and m>45):
    m = m-45
    print(h, m)
elif(h ==0 and m < 45 ):
    h=23
    m = 60 - (45-m)
    print(h, m)
else:
    m= (45-m)
    print(h, m)
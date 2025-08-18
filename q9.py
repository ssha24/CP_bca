x=int(input("enter a number: "))
sum=0
while x>0:
   
    i=x % 10
    x=x//10
    sum+=i
    print("digit is:", i) 
    print(x)


print("sum of digits is:", sum)
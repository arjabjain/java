n = int(input("enter a number: "))
i =2
while(i<n):
    if(n%i==0):
        print("not a prime",n)
        break
    else:
        print(f"given number is prime {n}")
    i=i+1


x=int(input())
def isprime(num):
    for i in range(2,num):
        if(num%i==0):
            return 0
    else:
        return 1
prime=[]
for i in range(2,x+1):
    ck=isprime(i)
    if ck==1:
        prime.append(i)
lcm=1
i=0
while(i<len(prime)):
    two=prime[i]
    while(two*prime[i]<=x):
        two=two*prime[i]
    lcm*=two
    i=i+1
print(lcm)
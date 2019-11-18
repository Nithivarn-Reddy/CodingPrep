#!/usr/bin/env python
# coding: utf-8

# In[27]:


def checkprime(item):
    if(item>2 and item%2 != 0):
        return 'prime'

input_lst=[]
n=int(input("Enter n"))
a = list(map(int,input("Enter the list : ").strip().split()))[:n] 
prime_count=0;
result='';
for i in range (0,n):
    result=checkprime(a[i])
    if(result=='prime'):
        prime_count=prime_count+1
#print (prime_count)
nprime_count=n-prime_count
prime_1_pair=nprime_count*prime_count
prime_2_pair=(prime_count*(prime_count-1)/2)
print("Total count of pairs: " + str(prime_1_pair+prime_2_pair))


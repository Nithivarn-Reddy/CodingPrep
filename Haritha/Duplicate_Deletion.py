#!/usr/bin/env python
# coding: utf-8

# In[2]:


n=int(input("Enter n"))
a = list(map(int,input("\nEnter the numbers : ").strip().split()))[:n] 
#print (a)
i=0
for j in range (1,n):
   if(a[j]!=a[i]):
    i=i+1
    a[i]=a[j]
print("Distinct items in array: "i+1)
for i in range(0,i+1):
    print(a[i])


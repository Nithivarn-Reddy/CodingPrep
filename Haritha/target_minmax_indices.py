#!/usr/bin/env python
# coding: utf-8

# In[ ]:


input_lst=[]
output_lst=[]
lst=[]
n=int(input("Enter n"))
a = list(map(int,input("Enter the list : ").strip().split()))[:n]
print(a)
target=input("Enter target")
#print(type(target))
for i in range (0,n):
    if(a[i]==int(target)):
        lst.append(i)
if(lst==[]):
    lst.append(-1)
print (str(lst[0]) + "," + str(lst[-1]))


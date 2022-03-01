arr=[]
for x in range(4):
  a = int(input("enter a Value"))
  arr.append(a)

for i in range(len(arr)-1):
  for j in range(len(arr)-1):
   if(arr[j]>arr[j+1]):
     temp = arr[j+1]
     arr[j+1] = arr[j]
     arr[j] =temp
print(arr) 

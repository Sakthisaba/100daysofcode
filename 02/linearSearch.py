arr=[]
for x in range(4):
  a = int(input("enter a Value"))
  arr.append(a)
  print(arr)

search = int(input("enter a Value to remove"))
k  =  0
for x in range(len(arr)-1) :
  
  if(arr[k]== search):
       print("Element found in")
      
  k= k+1
  
  
  
  

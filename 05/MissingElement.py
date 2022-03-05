def MissingNumber(array,n):
        T = n*(n+1)/2
        
        sum=0
        for i in range(0,n-1):
          sum = sum+array[i]
           
          
        while T>sum:
            
         res = T-sum;
         return round(res)

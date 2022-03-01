//ADD ELEMENT IN A ARRAY
public class My{
    static int  n = 0;
    public static void insert(int arr[],int p,int e){
    for(int i=n;i>=p;i++){
        arr[i+1] = arr[i];

    }
    arr[p] = e;
    n=n+1;
    System.out.println(arr[0]);
    }     

     public static void main(String [] args){
     int [] myarr  ={1,2,3,4,5};
       
        
        insert(myarr, 1, 0);
    
    }
    
}

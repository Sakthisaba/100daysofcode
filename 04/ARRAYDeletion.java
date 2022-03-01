public class My{
    
    public static void  Delete(int arr[],int p){
       int n =  arr.length;
    for(int i=p;i<arr.length;i++){
        //arr[i] = arr[i+1];
        arr[i-1] = arr[i];

    }
    
    n =n-1;
    for(int i=0;i<n;i++){
    System.out.println(arr[i]);}
    }     

     public static void main(String [] args){
     int [] myarr  ={1,2,3,4,5};
       
        
        Delete(myarr, 2);
    
    }
    
}

public class My{
    static int[][] arr1= new int[3][3];
    static int[][] arr2= new int[3][3];
    static int[][] arrfinal = new int [3][3]; 

    public static void addValue(int arr[][]){
        int k =0;
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
              k++; 
               arr[i][j] = k;
               
            }
        }
    }

    public static  void addTwoArray(int arr1[][],int arr2[][]) {
        
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
         arrfinal[i][j]=arr1[i][j] + arr2[i][j];
        }
       
    }
        
    }

    public static  void printArray(int arr[][]) {
      
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){ 
                
        System.out.print(arrfinal[i][j] + " ");}
        System.out.print("\n");
        
          
    }
        
    }
     public static void main(String [] args){
      
        addValue(arr1);
        addValue(arr2);
        addTwoArray(arr1,arr2);
        printArray(arrfinal);

     }
}

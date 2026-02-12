

public class Main {

    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void boobleSort(int arr[]){
        for(int pass=1; pass<arr.length; pass++){
            for(int curr=0; curr< arr.length-pass; curr++){
                if(arr[curr]>arr[curr+1]){
                    swap(arr, curr,curr+1);
                }
            }
        }
    }
    public static  void seclectionSort(int arr[]){
for(int usi=0; usi< arr.length-1; usi++){
    int minIndx= usi;
    for (int i= usi+1; i<arr.length; i++){
        if(arr[i]<arr[minIndx]) minIndx= i;
    }
    swap(arr, usi, minIndx);
    
}
    }

   public static void print(int arr[]){
       System.out.println("_____________________________________");
       for (int i=0; i<arr.length; i++){

           System.out.print(arr[i]+" ");

       }
       System.out.println();
   }


    public static void main(String[] args) {
        int arr[]={3,7,4,8,2};
        print(arr);
//        boobleSort(arr);
        seclectionSort(arr);
        print(arr);
    }
}
public class MergeSort {

public static  int [] merge(int a[],int b[]){
          int res[]= new int[a.length+b.length];
          int i=0, j=0, k=0;
          while (i<a.length&&j<b.length){
              if(a[i]<=b[j])
                  res[k++]=a[i++];
              else
                  res[k++]=a[j++];
          }
          while (i<a.length)
              res[k++]=res[i++];
          while (j<b.length)
              res[k++]=res[j++];

          return res;
    }
    public static int[] mergeSort(int arr[], int start ,int end){
    if (start==end)
        return new int[]{arr[start]};
    int mid = (start+end)/2;
    int firstHalf[]= mergeSort(arr, start, end);
    int secondHalf[]=mergeSort(arr,mid+1, end);
    return merge(firstHalf, secondHalf);

    }
    public static void  print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

    }


    public static void main(String[] args) {
//        int a[]={4,5,6,7,8,8,7,8};
//        int b[]={5,8,9,7,10,89};
//        print(a);
//        print(b);
//
//        int res[]= merge(a,b);
//        print(res);
        int arr[]={2,4,10,8,9};
        int res[]= mergeSort(arr, 0, arr.length-1);
        print(arr);
        print(res);
    }
}

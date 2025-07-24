package day_0724;

public class _04_Bubble {
    public static void main(String[] args) {


//         버블 정렬
        int[] arr = {1,6,3,7,5,9};

        int temp;

        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0;j< arr.length-1;  j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}

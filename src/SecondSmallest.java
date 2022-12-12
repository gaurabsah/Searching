import java.util.Arrays;

public class SecondSmallest {

    static void secondSmallest(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if (i==1){
                break;
            }
        }
        System.out.println("Array sorted in Ascending order: "+ Arrays.toString(arr));

        System.out.println("Second Smallest Element in Array: "+arr[1]);
    }

    public static void main(String[] args) {
        int[] arr={23,34,12,55,24};

        secondSmallest(arr);
    }
}

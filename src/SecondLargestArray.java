import java.util.Arrays;

public class SecondLargestArray {

    static void secondLargest(int[] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array sorted in descending order: "+Arrays.toString(arr));

        System.out.println("Second Largest Element in Array: "+arr[1]);
    }

    public static void main(String[] args) {
        int[] arr={23,34,12,55,24};

        secondLargest(arr);
    }
}

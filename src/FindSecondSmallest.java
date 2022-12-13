import java.util.Arrays;

public class FindSecondSmallest {

    static int findSecondSmallest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i=0;i< arr.length;i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,6,7,5};

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-------------------------------");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------------");
        int ans = findSecondSmallest(arr);
        System.out.println("Second Smallest Element: "+ans);
    }
}

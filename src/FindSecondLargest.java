
public class FindSecondLargest {

    static int findSecondLargest(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,6,7,5};

        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-------------------------------");
       int ans = findSecondLargest(arr);
        System.out.println("Second Largest Element: "+ans);
    }
}

public class MinMaxArray {

    static int maxArray(int[] arr){
       int max=arr[0];
       for (int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
       return max;
    }

    static int minArray(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {12,4,43,77,34};

        int a=maxArray(arr);
        System.out.println("Maximum element of array: "+a);

        int b=minArray(arr);
        System.out.println("Mininum element of array: "+b);
    }
}

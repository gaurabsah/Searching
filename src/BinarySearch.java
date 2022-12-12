import java.util.Scanner;

public class BinarySearch {

    static void search(int[] arr,int item){
        int li=0;                   // li-lower index
        int hi= arr.length-1;       // hi-higher index
        int mi=(li+hi)/2;           // mi-middle index

        while (li<=hi) {
            if (arr[mi] == item) {
                System.out.println("Item Found!!!"+"\nItem is at " + mi + " index");
                break;
            } else if (arr[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }

        if (li>hi){
            System.out.println("Item Not Found!!!");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n = scn.nextInt();

        System.out.println("Enter the element: ");
        int[] arr = new int[n];

        for (int i=0;i< arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Enter the item you want to search: ");
        int item=scn.nextInt();

        search(arr,item);
    }
}

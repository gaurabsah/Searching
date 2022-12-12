import java.util.Scanner;

public class LinearSearching {

    static void search(int[] arr,int item){
        int temp=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==item){
                System.out.println("Item is at "+i+" index");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("Item Not Found");
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

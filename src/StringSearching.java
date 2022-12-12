import java.util.Scanner;

public class StringSearching {
    static void search(String[] arr,String item){
        int temp=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i].equals(item)){
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
        String[] arr = new String[n];

        for (int i=0;i< arr.length;i++){
            arr[i]=scn.next();
        }

        System.out.println("Enter the item you want to search: ");
        String item=scn.next();

        search(arr,item);
    }
}

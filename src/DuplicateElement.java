import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

    static void duplicate(int[] arr){
        Set<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements are: ");
        for(int a:arr){
            if(!set.add(a)){
                System.out.println(a+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={12,34,12,77,34};

        duplicate(arr);
    }
}

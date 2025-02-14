package Session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);

        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);  // Combine both lists
        Collections.sort(mergedList); // Sort the merged list

        // Output the merged sorted list
        System.out.println("Merged Sorted List: " + mergedList);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {

        String[] stringArray = {"Apple", "Banana", "Cherry", "Date"};

        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println("List from Array: " + stringList);

        String[] newArray = stringList.toArray(new String[0]);
        System.out.println("Array from List: " + Arrays.toString(newArray));
    }
}

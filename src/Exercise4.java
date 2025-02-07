import java.util.HashSet;

public class Exercise4 {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "apple", "date"};

        boolean hasDuplicates = containsDuplicates(words);

        if (hasDuplicates) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array has no duplicates.");
        }
    }

    public static boolean containsDuplicates(String[] array) {
        HashSet<String> set = new HashSet<>();

        for (String word : array) {
            if (!set.add(word)) {
                return true;
            }
        }

        return false;
    }
}

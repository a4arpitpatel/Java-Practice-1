import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list3.add(1);
        list3.add(2);
        list3.add(4);

        //Exercise-1
        System.out.println("list1 equals list2: " + areEqual(list1, list2));
        System.out.println("list1 equals list3: " + areEqual(list1, list3));
    }

    public static boolean areEqual(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        return list1.equals(list2);
    }
}
import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        mainList.add(5);

        ArrayList<Integer> subset1 = new ArrayList<>();
        subset1.add(2);
        subset1.add(3);
        subset1.add(4);

        ArrayList<Integer> subset2 = new ArrayList<>();
        subset2.add(2);
        subset2.add(6);


        System.out.println("subset1 is a subset of mainList: " + isSubset(mainList, subset1));
        System.out.println("subset2 is a subset of mainList: " + isSubset(mainList, subset2));

    }

    public static boolean isSubset(ArrayList<Integer> mainList, ArrayList<Integer> subsetList) {
        return mainList.containsAll(subsetList);
    }
}

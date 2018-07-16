import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        FlatteningMultiList flatArray = new FlatteningMultiList();
        List<Object> nestedList=lst(1, lst(2, lst(3,4)));
        List<Object> flatList = flatArray.flattenMethod(nestedList);
        System.out.println(nestedList);
        System.out.println(flatList);

        List<Object> nestedList1=lst(1, lst(2, lst(3,4)),lst("Kasia", null, lst(3.74), lst('a'),4),3);
        List<Object> flatList1 = flatArray.flattenMethod(nestedList1);
        System.out.println(nestedList1);
        System.out.println(flatList1);

        List<Object> nestedList2=lst(null, lst("asda", lst(4)));
        List<Object> flatList2 = flatArray.flattenMethod(nestedList2);
        System.out.println(nestedList2);
        System.out.println(flatList2);
    }

    private static List<Object> lst(Object... objects){
        return asList(objects);
    }
}


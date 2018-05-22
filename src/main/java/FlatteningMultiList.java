import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class FlatteningMultiList {

    public static List<Object> flattenMethod(List<?> nestedList){
        List<Object> flatList=new LinkedList<Object>();

        for(Object element:nestedList){
            if(element instanceof List<?>){
                List<Object> newList = flattenMethod((List<?>) element);
                flatList.addAll(newList);
            }else {
                flatList.add(element);
            }
        }
        return flatList;
    }

    public static void main(String[] args) {
        List<Object> nestedList=lst(1, lst(2, lst(3,4)));
        List<Object> flatList = flattenMethod(nestedList);
        System.out.println(nestedList);
        System.out.println(flatList);
    }

    private static List<Object> lst(Object... objects){
        return asList(objects);
    }
}

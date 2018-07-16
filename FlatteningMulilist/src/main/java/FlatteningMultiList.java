import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class FlatteningMultiList {

    public List<Object> flattenMethod(List<?> nestedList) {
        List<Object> flatList = new LinkedList<Object>();

        for (Object element : nestedList) {
            if (element instanceof List<?>) {
                List<Object> newList = flattenMethod((List<?>) element);
                flatList.addAll(newList);
            } else {
                flatList.add(element);
            }
        }
        return flatList;
    }
}



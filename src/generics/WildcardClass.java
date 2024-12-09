package generics;

import java.util.List;

public class WildcardClass {

    public void printList(List<?> list){
        for(Object element : list){
            System.out.println(element);
        }
    }
}

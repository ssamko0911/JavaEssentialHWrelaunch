package hw009.task002.models;

import java.util.ArrayList;
import java.util.List;

public class MyList <T>{
    List <T> tList = new ArrayList<>();

    public void addValue (T someObject) {
        tList.add(someObject);
    }

    public int getSizeOfList() {
        return tList.size();
    }

    public T getValueByIndex (int someIndex) {
        return tList.get(someIndex);
    }
}

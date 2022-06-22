package courseworkessential.models;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private int size;

    public static final int INITIAL_SIZE = 10;

    Object[] myArrayList = new Object[INITIAL_SIZE];


    public boolean add(T someObject) {
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] == null) {
                myArrayList[i] = someObject;
            } else {
                Object[] myArrayListExtention = Arrays.copyOf(myArrayList, myArrayList.length + (myArrayList.length / 2));
                myArrayList = myArrayListExtention;
            }
        }
        return true;
    }

    public Object getElement(int index) {
        return myArrayList[index];
    }

    public int getSize() {
        return myArrayList.length;
    }


}

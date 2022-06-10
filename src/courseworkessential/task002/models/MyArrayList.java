package courseworkessential.task002.models;

public final class MyArrayList<S> {

    private int size;
    private Object[] list;
    private static final int INITIAL_SIZE = 10;

    public MyArrayList() {
        list = new Object[INITIAL_SIZE];
    }

    public int size() {
        return list.length;
    }
}

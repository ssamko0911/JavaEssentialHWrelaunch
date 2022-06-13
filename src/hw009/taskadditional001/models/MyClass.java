package hw009.taskadditional001.models;

public class MyClass<T> {
    private T object;

    public MyClass(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return String.format("%s object has data type %s and value - %s.",
                MyClass.class.getSimpleName(), object.getClass().getSimpleName(), object);
    }

    public static <T> MyClass<T> factoryMethod(T someValue) {
        return new MyClass<>(someValue);
    }
}

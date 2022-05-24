package taskadditional001.models;

public class Cat extends Animal {
    private boolean isTail;

    public Cat() {
    }

    public Cat(String name, boolean isTail) {
        super(name);
        this.isTail = isTail;
    }

    public boolean isTail() {
        return isTail;
    }

    public void setTail(boolean tail) {
        isTail = tail;
    }

    @Override
    public void voice() {
        System.out.printf("%s: this is my MEOW - voice!\n", getClass().getSimpleName());
    }

    @Override
    public void voice(String message) {
        System.out.printf("%s said: %s!\n", getClass().getSimpleName(), message);
    }
}
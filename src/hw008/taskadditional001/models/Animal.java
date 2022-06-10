package hw008.taskadditional001.models;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean isTale;

    public Animal(String name, int age, boolean isTale) {
        this.name = name;
        this.age = age;
        this.isTale = isTale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTale() {
        return isTale;
    }

    public void setTale(boolean tale) {
        isTale = tale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && isTale == animal.isTale && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isTale);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, age: %d, tail: %s.", name, age, isTale);
    }
}

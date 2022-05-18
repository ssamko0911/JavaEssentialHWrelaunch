package hw001.task004;

// Не очень разобрался с постановкой задачи, ниже несколько манипуляций с массивами. Готов доработать.

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            System.out.printf("\nObject Computer #%d has created and added into data storage.", i + 1);
        }

        for (Computer item : computers) {
            System.out.printf("\nObject of class %s with hashcode %d is present in the storage.",
                    item.getClass().getSimpleName(),
                    item.hashCode());
        }
    }
}
package courseworkessential;

import courseworkessential.models.MyArrayList;

/*
Задача 2
Попрактикуйте работу со списками выполнив следующие пункты:
1. Реализовать собственный ArrayList, методы:, add(elem), add(index, elem), get(index),
contains(Object), clear(), remove(index), size()
2. Реализовать собственный LinkedList: методы, add(elem), addFirst(elem), addLast(elem),
removeFirst(), removeLast(), getFirst(), getLast(), size()

 */
public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Ivan");
        myArrayList.add("Anton");
        myArrayList.add("Igor");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");
        myArrayList.add("Ivan");

        System.out.println(myArrayList.getElement(0));
    }
}

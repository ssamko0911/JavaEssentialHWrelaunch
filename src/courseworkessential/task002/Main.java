package courseworkessential.task002;

import courseworkessential.task002.models.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;

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
        MyArrayList<String> stringMyArrayList = new MyArrayList<>();
        System.out.println(stringMyArrayList.size());
    }
}

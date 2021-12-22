package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator0 {
    public static void names2() {
        ArrayList<String> writers = new ArrayList<String>();
        writers.add("Уильям Шекспир");
        writers.add("Уильям Фолкнер");
        writers.add("Генри Джеймс");
        writers.add("Джейн Остин");
        writers.add("Чарльз Диккенс");
        System.out.print("Все писатели: ");
        Iterator<String> ite = writers.iterator();
        while (ite.hasNext()) {
            String element = ite.next();
            System.out.print(element + ", ");
        }
        System.out.println();

        ListIterator<String> lit = writers.listIterator();
        while (lit.hasNext()) {
            String element = lit.next();
            lit.set(element + " top,");
        }
        System.out.println();
        ite = writers.iterator();
        while (ite.hasNext()) {
            String element = ite.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Список в обратном порядке: ");
        while (lit.hasPrevious()) {
            String element = lit.previous();
            System.out.print(element + " ");

        }
        System.out.println();
    }
}


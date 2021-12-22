package com.company;

import java.util.ArrayList;

public class ArrayList0 {
    public static void show () {
        ArrayList<String> writers  = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива writers: " + writers.size());
        System.out.println("Cписочный массив writers пустой: " + writers.isEmpty());
        writers.add("Уильям Шекспир");
        writers.add("Уильям Фолкнер");
        writers.add("Генри Джеймс");
        writers.add("Джейн Остин");
        writers.add("Чарльз Диккенс");
        writers.add("Фёдор Достоевский");
        writers.add("Эрнест Хемингуэй");
        writers.add("Франц Кафка");
        writers.add("Джеймс Джойс");
        writers.add("Вирджиния Вулф");
        writers.add(5,"Марк Твен");
        System.out.println("Количество авторов в списочном массиве writers: " + writers.size());
        System.out.println("Все писатели: " + writers);
        writers.remove("Фёдор Достоевский");
        writers.remove(8);
        writers.set(4, "Юлия Жарова");
        System.out.println("Размер сокращенного списка писателей: " + writers.size());
        System.out.println("Сокращенный список писателей: " + writers);
        System.out.println("Cписочный массив writers пустой: " + writers.isEmpty());

        String iwriters [] = new String[writers.size()];
        iwriters = writers.toArray(iwriters);

    }
}

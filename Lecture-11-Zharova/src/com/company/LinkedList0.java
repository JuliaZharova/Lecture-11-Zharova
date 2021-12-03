package com.company;

import java.util.LinkedList;

public class LinkedList0 {
    public static void showTop10 (){
        LinkedList<String> top10 = new LinkedList<String>();
        System.out.println("Список пустой: " + top10.isEmpty());

        top10.add(0,"Война и мир");
        top10.addFirst("1984");
        top10.add(2, "Улисс");
        top10.add(3, "Лолита");
        top10.add(4, "Звук и ярость");
        top10.addLast("Человек-невидимка");
        top10.add(6, "На маяк");
        top10.add(7, "Одиссея");
        top10.add(8, "Гордость и предубеждение");
        top10.add(9, "Божественная комедия");

        System.out.println("Список пустой: " + top10.isEmpty());
        System.out.println("Список: " + top10);

        top10.remove(7);
        top10.remove("Улисс");
        top10.removeLast();
        top10.removeFirst();
        top10.removeLast();

        System.out.println("Сокращенный список: " + top10);

        String wr = top10.get(1);
        top10.set(1, wr + " (Набоков)");
        System.out.println("Список: " + top10);

    };
}

package com.company;

import java.util.HashSet;

public class HashSet0 {

    public static void rainbow () {
        HashSet<String> rainbow = new HashSet<String>();
        System.out.println("Список пустой: " + rainbow.isEmpty());
        rainbow.add("Red");
        rainbow.add("orange");
        rainbow.add("yellow");
        rainbow.add("green");
        rainbow.add("blue");
        rainbow.add("indigo");
        rainbow.add("violet");
        System.out.println("Список пустой: " + rainbow.isEmpty());
        System.out.println("Цвета радуги: " + rainbow);
        System.out.println("Количество цветов: " + rainbow.size());
        System.out.println("В радуге есть розовый цвет: " + rainbow.contains("pink"));
        System.out.println("В радуге есть красный цвет: " + rainbow.contains("Red"));
        rainbow.clear();
        System.out.println("Список пустой: " + rainbow.isEmpty());
    }

}

package com.company;

import java.util.TreeSet;

public class TreeSet0 {

    public static void name () {
        TreeSet <String> name2021 = new TreeSet<String>();
        System.out.println("Список пустой: " + name2021.isEmpty());

        name2021.add("Анна");
        name2021.add("София");
        name2021.add("Мария");
        name2021.add("Виктория");
        name2021.add("Дарья");
        name2021.add("Вероника");
        name2021.add("Полина");
        System.out.println("Список пустой: " + name2021.isEmpty());
        System.out.println("Список самых популярных имен 2021: " + name2021);

        System.out.println(name2021.subSet("Д", "С"));
        System.out.println("Самое короткое имя: " + name2021.ceiling("3"));
    }
}

package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap0 {
    public static void bones2 () {
        TreeMap<String, String> bon = new TreeMap<String, String>();
        bon.put("Режиссер", "Иэн Тойнтон ");
        bon.put("Сценарист","Харт Хэнсон ");
        bon.put("Продюссер","Кэти Райкс ");
        bon.put("Жанр","Драмы");
        bon.put("Страна","США ");

        System.out.println(bon.containsKey("Год"));
        System.out.println(bon.containsKey("Страна"));
        System.out.println(bon.containsValue("Иэн Тойнтон"));
        System.out.println(bon.containsValue("Харт Хэнсон "));
        System.out.println(bon.keySet());
        System.out.println(bon.remove("Жанр"));
        System.out.println(bon.firstKey());

    }
}

package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap0 {
    public static void bones () {
        HashMap <String, String> bon = new HashMap<String, String>();
        bon.put("Режиссер", "Иэн Тойнтон ");
        bon.put("Сценарист","Харт Хэнсон ");
        bon.put("Продюссер","Кэти Райкс ");
        bon.put("Жанр","Драмы");
        bon.put("Страна","США ");

        Set<Map.Entry<String, String>> set = bon.entrySet();
        for (Map.Entry<String, String> res : set) {
            System.out.print(res.getKey() + ": ");
            System.out.println(res.getValue());
        }
        System.out.println();
        String genre = bon.get("Жанр");
        bon.put("Жанр", genre + ", Детектив");
        System.out.println("Расширенный список жанров: " + bon.get("Жанр"));
    }
}

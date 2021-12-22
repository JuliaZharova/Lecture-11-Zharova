package com.company;

import java.util.ArrayDeque;

public class ArrayDeque0 {
    public static void films () {
        ArrayDeque <String> films = new ArrayDeque<String>();
        System.out.println("Список пустой: " + films.isEmpty());
        films.push("The Last Duel");
        films.push("The Power of the Dog");
        films.push("Red Notice");
        films.push("Venom: Let There Be Carnage");
        films.push("The Whole Truth");
        films.push("Last Night in Soho");

       System.out.println("Список пустой: " + films.isEmpty());
       System.out.println("Количество фильмов: " + films.size());
       System.out.println("Фильмы: " + films);

       System.out.println("В списке есть фильм 'Home Alone' " + films.contains("Home Alone"));
       System.out.println("В списке есть фильм 'Red Notice' " + films.contains("Red Notice"));

        System.out.println(films.element()); // возвращаем элемент из головы очереди и НЕ удаляем
        System.out.println(films.offer("Home Alone")); // пытаемся ввести элемент в очередь
        System.out.println(films.poll()); // возвращаем элемент из головы очереди и УДАЛЯЕМ ЕГО
        System.out.println(films.peek()); // возвращаем элемент из головы очереди и НЕ удаляем
        System.out.println(films.remove()); // возвращаем элемент из головы очереди и УДАЛЯЕМ ЕГО

        System.out.println("Фильмы: " + films);


    }
}

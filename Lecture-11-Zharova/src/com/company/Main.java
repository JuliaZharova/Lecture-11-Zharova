package com.company;

import static com.company.ArrayDeque0.films;
import static com.company.ArrayList0.show;
import static com.company.HashMap0.bones;
import static com.company.HashSet0.rainbow;
import static com.company.Iterator0.names2;
import static com.company.LinkedList0.showTop10;
import static com.company.TreeMap0.bones2;
import static com.company.TreeSet0.name;

public class Main {

    public static void main(String[] args) {
	System.out.println("ArrayList");
    show();
    System.out.println();

    System.out.println("LinkedList");
    showTop10();
    System.out.println();

    System.out.println("HashSet");
    rainbow ();
    System.out.println();

    System.out.println("TreeSet");
    name();
    System.out.println();

    System.out.println("ArrayDeque");
    films();
    System.out.println();

    System.out.println("Iterator");
    names2();
    System.out.println();

    System.out.println("HashMap");
    bones();
    System.out.println();

    System.out.println("TreeMap");
    bones2();
    }
}

package com.gmail.tsikalenko.nikita;


public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list.toString());

        MyArrayList<Integer> list2 = new MyArrayList<Integer>();
        list2.add(0);
        list2.addAll(list);

        System.out.println(list2.toString());

        System.out.println(list2.conteins(5));
        System.out.println(list2.conteins(8));


        System.out.println(list2.get(2));

        list2.remove(2);

        System.out.println(list2.toString());

        list2.set(2, 9);

        for (Object i : list2.toArray()) {
            System.out.println(i);
        }
    }
}

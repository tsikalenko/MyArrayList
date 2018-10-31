package com.gmail.tsikalenko.nikita;

public class MyArrayList<T> {
    private T[] list;

    public MyArrayList() {
    }

    public void add(T t) {
        if (list != null) {
            T[] newlist = (T[]) new Object[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                newlist[i] = list[i];
            }
            newlist[newlist.length - 1] = t;
            list = newlist;
        } else {
            list = (T[]) new Object[1];
            list[0] = t;
        }
    }

    public void add(T t, int index) {
        T[] newlist = (T[]) new Object[list.length + 1];
        for (int i = 0; i < index; i++) {
            newlist[i] = list[i];
        }
        list[index] = t;
        for (int i = index + 1; i < newlist.length; i++) {
            newlist[i] = list[i];
        }
        list = newlist;
    }

    public boolean set(int index, T t) {
        if (index > list.length) {
            return false;
        }
        list[index] = t;
        return true;
    }

    public boolean remove(T t) {
        return remove(indexOf(t));
    }

    public boolean remove(int index) {
        if (index > list.length) {
            return false;
        }
        T[] newlist = (T[]) new Object[list.length - 1];
        for (int i = 0; i < index; i++) {
            newlist[i] = list[i];
        }
        for (int i = index + 1; i < list.length; i++) {
            newlist[i - 1] = list[i];
        }
        list = newlist;
        return true;
    }

    public void addAll(MyArrayList<T> addList) {
        T[] newlist = (T[]) new Object[list.length + addList.size()];
        for (int i = 0; i < list.length; i++) {
            newlist[i] = list[i];
        }
        for (int i = list.length, j = 0; i < newlist.length; i++, j++) {
            newlist[i] = addList.get(j);
        }
        list = newlist;
    }

    public T get(int index) {
        return list[index];
    }

    public int size() {
        return list.length;
    }

    public int indexOf(T el) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(el)) {
                return i;
            }
        }
        return -1;
    }

    public void clean() {
        list = null;
    }

    public boolean conteins(T t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        return list;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (T t : list) {
            sb.append(t).append(" ");
        }
        return sb.toString();
    }
}

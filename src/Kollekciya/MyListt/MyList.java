package Kollekciya.MyListt;

import java.util.*;

public class MyList implements List<String> {
    private Object String;

    public static void main(String[] args) {
        MyList darova = new MyList();
        darova.add("darow");
        darova.add("poka");
        darova.add("hto ce?");



        System.out.println(darova.get(2));
        System.out.println(darova.get(1));
        System.out.println(darova.indexOf("darow"));
        System.out.println(darova.isEmpty());
        System.out.println(darova.contains("darow"));
        System.out.println(darova.size());
        System.out.println(darova.set(1,"privet"));
        System.out.println(darova.get(1));

        darova.add(1,"so what");
        darova.add(1,"mazafaka");
        System.out.println();
        System.out.println();
        System.out.println(darova.get(0));
        System.out.println(darova.get(1));
        System.out.println(darova.get(2));
        System.out.println(darova.get(3));
        System.out.println(darova.get(4));
        System.out.println(darova.size());
        System.out.println();
        System.out.println();
        darova.remove(2);
        System.out.println(darova.size());
        System.out.println(darova.get(2));
        System.out.println(darova.remove(3));
        System.out.println(darova.size());
        System.out.println(darova.get(4));
        System.out.println();
        System.out.println();
        darova.add("narket");
        darova.add("RABOTAI");
        darova.add("narket");
        System.out.println(darova.size());
        System.out.println(darova.get(0));
        System.out.println(darova.get(1));
        System.out.println(darova.get(2));
        System.out.println(darova.get(3));
        System.out.println(darova.get(4));
        System.out.println(darova.get(5));
        System.out.println(darova.size());
        System.out.println();
        System.out.println();
        System.out.println();
        darova.add("HELLO");
        darova.add("narket");
        System.out.println(darova.get(4));
        System.out.println(darova.get(3));
        System.out.println(darova.get(2));
        System.out.println(darova.get(1));
        System.out.println(darova.get(0));
        System.out.println();
        System.out.println();
        System.out.println(darova.iterator().hasNext());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().hasNext());
        System.out.println(darova.iterator().next());
        System.out.println(darova.iterator().hasNext());
        MyList proverka = new MyList();
        proverka.add("HELLO");
        proverka.add("narket");
        System.out.println(darova.containsAll(proverka));
        System.out.println(darova.size);




    }

    String []storage = new String[2];


    int size = 0;
    int i = 0;   // i = size for iterator


    @Override
    public int indexOf(Object o) {
        String element = (String)o;
        for(int i = 0; i < storage.length; i++) {
            if (storage[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override

    public String get(int index) {
        return storage[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;

    }

    @Override
    public boolean contains(Object o) {
        int result = indexOf(o);
        return result == -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object o) {
        String element = (String)o;
        int oldSize = size;
        for (int i = 0; i < size; i++) {
            if (o.equals(storage[i])) {
                System.arraycopy(storage,i + 1, storage, i, size - (i + 1));
                storage[size - 1] = null;
                size --;
            }

        }
        return oldSize != size;
    }

    @Override
    public String remove(int index) {
        String delete = storage[index];
        System.arraycopy(storage,index +1, storage,index,size - (index +1));

        size--;
        return delete;
    }

    @Override
    public String set(int index, String element) {
        String oldStorage = storage[index];
        storage[index] = element;
        return oldStorage;
    }

    @Override
    public void add(int index, String element) {
        if (size >= storage.length){
            String [] oldStorage = storage;
            storage = new String[size * 2];
            System.arraycopy(oldStorage,0, storage,0,index);
            System.arraycopy(oldStorage,index,storage, index + 1,size - index);

        }else {
            System.arraycopy(storage, index, storage, index + 1, size - index);
        }
        storage[index] = element;
        size++;
    }

    @Override
    public boolean add(String s) {
        if (size >= storage.length){
            String [] oldStorage = storage;
            storage = new String[size * 2];
            System.arraycopy(oldStorage,0, storage,0,oldStorage.length);
        }
        storage[size++] = s;

        return true;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> Iter = new Iterator<>() {


            @Override
            public boolean hasNext() {

                return i != size;
            }

            @Override
            public String next() {
                String element = storage[i];
                i++;
                return element;
            }
            @Override
            public void remove() {
                System.arraycopy(storage,i - 1, storage, i, size - i);
                i--;
                size--;
            }
        };

        return Iter;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public Object[] toArray() {

        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {


            return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {

        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }


}



